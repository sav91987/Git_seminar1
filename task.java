// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class task {

    public static String readFile(String path, Charset encoding) throws IOException {
        String content;
        Scanner scanner = new Scanner(new File(path), String.valueOf(encoding));
        content = scanner.useDelimiter("\\A").next();
        return content;
    }

    public static String clearedJsonString(String line) {

        line = line.substring(1, line.length() - 1);
        line = line.replaceAll("\"", "");
        line = line.replaceAll(" ", "");
        line = line.replaceAll(":", " ");
        line = line.replaceAll(",", " ");

        return line;
    }

    public static void getWhere(String str, String[] mass) {

        StringBuilder sb = new StringBuilder(str);
        String line = null;

        for (int i = 0; i < mass.length; i += 2) {
            if ((mass[i].equals("null")) || (mass[i + 1].equals("null"))) {
                i += 2;
            } else {
                StringBuilder s = new StringBuilder(mass[i]);
                StringBuilder s_ = new StringBuilder(mass[i + 1]);
                sb.append(s + "=" + "'" + s_ + "' AND ");
            }
        }

        line = sb.substring(0, sb.length() - 5);
        System.out.println(line);
    }

    public static void main(String[] args) {
        String SqlStr = "select * from students where ";

        String filePath = "file.txt";
        String content = null;

        try {
            content = readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        content = clearedJsonString(content);

        String[] arr = content.split(" ");
        
        getWhere(SqlStr, arr);
    }
}