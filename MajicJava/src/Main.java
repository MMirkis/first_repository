import LessonСonditionalStatements.SortingHat;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {

        List<String> colltctTichers = List.of("Dumbledore", "Mcgonagall", "Snape", "Lupin", "Hugrid");
        colltctTichers.forEach(teacher-> System.out.print(teacher+" "));


        Random random = new Random();
        int grade1 = random.nextInt(1,11);
        int grade2 = random.nextInt(1,11);
        boolean result = IntStream.of(grade1, grade2).allMatch(grade -> grade > 5);
        double average = IntStream.of(grade1, grade2).average().orElse(0);
        System.out.println(result);
        System.out.println(average);

        int counter = 4199;
        int sum = IntStream.of(counter % 13, counter % 14, counter % 15, counter % 16, counter % 17, counter % 19)
                .sum();
        System.out.println(sum);
 }
    public static void print(Object object){
        System.out.println(object.toString());
    }
}