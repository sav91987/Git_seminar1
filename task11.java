// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;

public class task11 {

    public static List<Integer> randomFill() {
        List<Integer> mass = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mass.add((int) (Math.random() * 10));
        }
        System.out.println(mass);
        return mass;
    }

    public static void getOddNumberList(List<Integer> numberList) {
        List<Integer> evenNumberList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) % 2 == 0) {
                evenNumberList.add(numberList.get(i));
            }
        }
        numberList.removeAll(evenNumberList);
        System.out.println(numberList);

    }

    public static void main(String[] args) {
        List<Integer> mass = randomFill();
        getOddNumberList(mass);

    }
}
