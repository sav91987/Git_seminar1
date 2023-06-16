// Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива
// такой, что сумма элементов с индексами < i равна сумме
// элементов с индексами > i. 


public class task8 {

    public static int FindSumLeft(int index, int[] arr) {
        int sumLeft = 0;
        for (int i = 0; i < index; i++) {
            sumLeft += arr[i];
        }
        return sumLeft;
    }

    public static int FindSumRight(int index, int[] arr) {
        int sumRight = 0;
        for (int i = index + 1; i < arr.length; i++) {
            sumRight += arr[i];
        }
        return sumRight;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {

            int sumFirst = FindSumLeft(i, nums);
            int sumSecond = FindSumRight(i, nums);
            if (sumFirst == sumSecond) {
                System.out.println(i);
                count++;
            }
        }
        if (count==0) {
            System.out.println(-1);
        }
    }
}
