import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Lesson36 {
    private String separater;

    private Scanner scanner ;

    public Lesson36(File fale) throws FileNotFoundException {

        this.separater=File.separator;
        this.scanner= new Scanner(fale);

    }

    public void readFromFile(String path) throws FileNotFoundException {

        //когда в папке проекта лежит файл
        creatFile("C:"+separater+"Users"+separater+"mihat"+separater+"Desktop"+separater+"test.txt");
        String line=scanner.nextLine();
        String input = scanner.nextLine();
        String[]numbersString=input.split(" ");
        System.out.println(Arrays.toString(numbersString));
        int[] numbers=new int[numbersString.length];
        int count=0;

        for (String number : numbersString) {
            numbers[count++]=Integer.parseInt(number);
            System.out.println(number);
        }
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }


        System.out.println(Arrays.toString(numbers));
        scanner.close();

    }

    private File creatFile(String path){
        return new File(path);
    }
}
