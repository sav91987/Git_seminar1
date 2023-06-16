// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i += 2) {
            int count = 0;
            for (int j = 1; j <= i; j += 2) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
