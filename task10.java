// 1. Реализовать алгоритм сортировки слиянием(метод взять из Интернета)

import java.util.ArrayList;
import java.util.List;

public class task10 {

    public static ArrayList<Integer> randomFill() {

        ArrayList<Integer> mass = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mass.add((int) (Math.random() * 10));
        }

        System.out.println(mass);
        return mass;
    }

    public static List<Integer> mergeSort(List<Integer> sortArr) {

        List<Integer> buffer1 = sortArr;
        List<Integer> buffer2 = new ArrayList<>();

        for (int i = 0; i < sortArr.size(); i++) {
            buffer2.add(null);
        }

        List<Integer> result = mergeSortInner(buffer1, buffer2, 0, sortArr.size());

        return result;
    }

    public static List<Integer> mergeSortInner(List<Integer> buffer1, List<Integer> buffer2, int startIndex,
            int endIndex) {

        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        List<Integer> sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        List<Integer> sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        List<Integer> result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) {

            if ((sorted1.get(index1)) < (sorted2.get(index2))) {
                result.set((destIndex++), sorted1.get(index1++));
            } 
            else {
                result.set((destIndex++), sorted2.get(index2++));
            }
        }

        while (index1 < middle) {

            result.set((destIndex++), sorted1.get(index1++));
        }
        while (index2 < endIndex) {
            
            result.set((destIndex++), sorted2.get(index2++));
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> sortArr = randomFill();
        List<Integer> result = mergeSort(sortArr);
        System.out.println(result);
    }

}
