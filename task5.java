// Во фразе "Добро пожаловать на курс по Java" переставить слова
//в обратном порядке.

public class task5 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс Java";
        String[] strDev = str.split(" ");

        int lengthStrDev = strDev.length;
        String[] newStrDev = new String[strDev.length];
        for (int i = 0; i < newStrDev.length; i++) {
            newStrDev[i] = strDev[lengthStrDev - 1];
            lengthStrDev--;
        }
        System.out.println(String.join(" ", newStrDev));
    }
}
