package LessonString;

import java.util.Random;

public class LessonString1 {

    public static void main(String[] args)  {
        String str;
        str = creatString();
        str=corrective(str);
        checkingForSubstring(str,"23");
        checkingForIndex(str,"ob");

    }
    public static String creatString(){
        String str="";
        StringBuilder builder=new StringBuilder();
        for ( int i = 0;i <5; i++){
            int number  = new Random().nextInt( );
            builder.append(number);
        }
        str= builder.toString();
        System.out.println("Исходная строка: "+str);
        return str;
    }
    public static String corrective(String str){
        StringBuilder builder=new StringBuilder();
        str=str.replace("1","i");
        str=str.replace("-","");
        str=str.replace("0","o");
        str=str.replace("6","b");
        System.out.println(str);
        return str;
    }
    public static void checkingForSubstring(String str ,String substringToBeChecked){
        System.out.println(str.contains(substringToBeChecked));
    }
    public static void checkingForIndex(String str ,String substringToBeIndex){
        int index=str.indexOf(substringToBeIndex);
        if (index==-1){
            System.out.println("Такой подстроки не существует ");
        }
        else System.out.println("Индекс подстроки: "+index);
    }

    }
