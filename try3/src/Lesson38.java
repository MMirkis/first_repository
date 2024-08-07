import java.io.IOException;
import java.util.Scanner;

public class Lesson38 {
    public static void main(String[]args) throws ScanerException {
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("Введите ноль ");
         int a=Integer.parseInt(scanner.nextLine());
         if (a !=0){
             throw new ScanerException("Ввел чтото короме нуля");

         }
        }
    }
}
