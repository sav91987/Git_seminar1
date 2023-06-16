// Записать в файл следующие данные:

// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23 

import java.io.FileWriter;
import java.io.IOException;

public class task9 {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("file.txt", false)) {
            writer.write("Name Surname Age\n");
            writer.write("Kate Smith 20\n");
            writer.write("Paul Green 25\n");
            writer.write("Mike Black 23");

        }

        catch (IOException exep) {
            System.out.println(exep);
        }
    }
}
