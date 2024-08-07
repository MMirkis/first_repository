package LessonRound;

import java.util.Random;

public class Quiddich {
    public static void main(String[] args) {
        Quiddich quiddich=new Quiddich();
        quiddich.sum();
    }

    public void getBall(){
         for(int i =1;i<=3;i++){
             System.out.print("Запущен мяч под названием: ");
             if (i==1){
                 System.out.println("Quaffle");
             } else if (i==2) {
                 System.out.println("Bluger");
             }else System.out.println("Golden snitch");

         }
    }

    public void playGame(){
        while ( true){
            int control= new Random().nextInt(0,101);
            if (control==100){
                System.out.println("Wow!! You cip snitch");
                break;
            }
            System.out.println("No cip...");
        }
    }
    public void sum(){
        int sum=0;
        for (int i=222;i<=444;i++){
            if (i%2==0){
                sum+= i;
            }
            if (i==444){
                System.out.println(sum);
            }
        }
    }
}


