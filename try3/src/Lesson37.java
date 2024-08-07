import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37 {
    public static void main(String[] args) {
      try {
          readFile();
      }catch (FileNotFoundException e){
          System.out.printf("ОБработка в методе main");
      }
    }
    public  static  void  readFile() throws FileNotFoundException {
        File file= new File("dsds");
        Scanner scanner =new Scanner(file);



    }
}
