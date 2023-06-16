// 2) Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.


import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
 
public class task_ {

    public static void BubbleSort() throws IOException {
        Logger logger = Logger.getLogger(task_.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        int [] mass = {10, 8, 6, 4, 2};
        int temp;
        
        for (int j = 0; j < mass.length-1; j++) {
            for (int i = 0; i < mass.length-1; i++) {
                if(mass[i] > mass[i+1]){
                    temp = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = temp;
                }
            }
            logger.info(Arrays.toString(mass));
        }
        System.out.println(Arrays.toString(mass));
        
    }
    public static void main(String[] args) throws IOException {
      
        try {
            BubbleSort();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}