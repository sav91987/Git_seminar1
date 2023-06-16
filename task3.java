
// Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        double numFirst = scan.nextDouble();

        System.out.println("Введите знак арифметической операции '+', '-', '*', '/',: ");
        String sign = scan.next();

        System.out.println("Введите второе число: ");
        double numSecond = scan.nextDouble();

        if (sign.equals("+")) {
            System.out.println("Сумма равна: " + (numFirst + numSecond));
        } else if (sign.equals("-")) {
            System.out.println("Разность равна: " + (numFirst - numSecond));
        } else if (sign.equals("*")) {
            System.out.println("Произведение равно: " + (numFirst * numSecond));
        } else if (sign.equals("/")) {
            System.out.println("Частное равно: " + (numFirst / numSecond));
        } else
            System.out.println("Введен неверный знак арифметической операции!");
    }
}
