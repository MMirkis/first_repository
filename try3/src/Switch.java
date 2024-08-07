import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = in.nextInt();
        switch(age){
            case 0 :
                System.out.println("Как ты пишешь");
                break;
            case 7:
                System.out.println("Еще спиногрыз");
                break;
            case 18:
                System.out.println("Скоро сопьешься");
                break;
            default:
                System.out.println("Я тебя не знаю");
        }
    }
}
