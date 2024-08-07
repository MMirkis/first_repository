package LessonСonditionalStatements;

import java.util.Scanner;

public class SortingHat {


    public void sort() {
        Scanner scanner = new Scanner(System.in);
        String question1 = ("Ты предпочитаешь работать в команде? (Да/Нет)");
        System.out.println(question1);
        String answer1 = scanner.nextLine();
        String question2 = ("Ты любишь разгадывать головоломки? (Да/Нет)");
        System.out.println(question2);
        String answer2 = scanner.nextLine();
        String question3 = ("Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)");
        System.out.println(question3);
        String answer3 = scanner.nextLine();
        String question4 = ("Ты проявляешь заботу к существам и природе? (Да/Нет)");
        System.out.println(question4);
        String answer4 = scanner.nextLine();
        if (answer1.equals("Да")) {
            if (answer3.equals("Да")) {
                System.out.println("Грифиндор");
            } else if (answer4.equals("Да")) {
                System.out.println("Пуфендуй");
            }
        } else if (answer2.equals("Да")) {
            if (answer3.equals("Да")) {
                System.out.println("Когтевран");
            } else {
                System.out.println("Слизерин");
            }
        } else if (answer3.equals("Да")) {
            System.out.println("Слизерин");
        } else {
            System.out.println("Пуфендуй");
        }
    }
}















