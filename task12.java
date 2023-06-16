// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task12 {

    public static List<Integer> randomFill() {

        List<Integer> mass = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mass.add((int) (Math.random() * 10));
        }

        return mass;
    }

    public static void getAverageAndMedian(List<Integer> arr) {

        double sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        double average = sum / arr.size();

        System.out.println("Среднее арифметическое элементов равно: " + average);

        double temp = Math.abs(arr.get(0) - average);
        int index = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (Math.abs(arr.get(i) - average) < temp) {
                temp = Math.abs(arr.get(i) - average);
                index = i;
            }
        }
        System.out.println("Медианное значение равно: " + arr.get(index));
    }

    public static void main(String[] args) {

        List<Integer> mass = randomFill();

        System.out.println(mass);
        System.out.println("Максимальный элемент равен: " + Collections.max(mass));
        System.out.println("Минимальный элемент равен: " + Collections.min(mass));

        getAverageAndMedian(mass);
    }
}