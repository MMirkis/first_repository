package LessonСonditionalStatements;

import java.util.Random;

public class LessonСonditionalStatements {
    public static void main(String[] args) {
        int number1=new Random().nextInt(0,10);
        int number2=new  Random().nextInt(0,10);
        if (number1%2==0){
            if (number2%2==0){
                System.out.println((number1/2)+(number2/2));
            }
            else {System.out.println((number1/2)+number2);
            }
        }
        else if (number2%2==0){
            System.out.println((number2/2)+number1);
        }
        else{ System.out.println(number1+number2);
        }
    }
}
