// (задание со *) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        int numFirst = scan.nextInt();

        System.out.println("Введите второе число: ");
        int numSecond = scan.nextInt();

        System.out.println("Введите результат: ");
        int res = scan.nextInt();

        int[] massFirst = new int[10];
        int[] massSecond = new int[10];

        for (int i = 0; i < massFirst.length; i++) {
            massFirst[i] = numFirst * 10 + i;
            massSecond[i] = i * 10 + numSecond;
        }
        int count = 0;
        for (int i = 0; i < massFirst.length; i++) {

            for (int j = 0; j < massSecond.length; j++) {

                if (massSecond[j] + massFirst[i] == res) {
                    count++;
                    System.out.println(massFirst[i] + " + " + massSecond[j] + " = " + res);
                }
            }
        }
        if (count == 0) {
            System.out.println(
                    "Нет подходящего выражения для выполнения " + numFirst + "? + ?" + numSecond + " = " + res);
        }
    }
}
