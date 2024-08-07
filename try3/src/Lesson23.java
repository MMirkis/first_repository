import java.util.Locale;

public class Lesson23 {
    public static void main(String[] args) {
        String s = "hello";
        s = s.toUpperCase();
        System.out.println(s);

        String one="Hello";
        String two="my";
        String three="friend";
        String stringALL=one+two+three;
        System.out.println(stringALL);

        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());

        System.out.printf("This is a string %s\n","Nice");

        System.out.printf("This is a string %d\n",10);

        System.out.printf("String %-10d\n",5);
        System.out.printf("String %-10d\n",1000000);

        System.out.printf("String %.2f\n",5.456789);
    }
}
