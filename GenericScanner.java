import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class GenericScanner {
    public static void main(String[] args) {
        try {
            File file = new File("PracticeA.txt");
            Scanner fin = new Scanner(file);
            
            // code
            
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found\n");
        }
    }
}
