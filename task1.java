// Вычислить сумму чисел от 1 до n

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scan = new Scanner(System.in);
        int num_n = scan.nextInt();

        int sum = 0;

        for (int i = 0; i <= num_n; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 0 до " + num_n + " равна: " + sum);
    }
}