package Lesson42;

public class Test_Lesson42 {
    public static void main(String[]args){
        int x=1;
        int y=1;
        Animal animal1=new Animal(1);
        Animal animal2= new Animal(1);
        System.out.println(x==y);
        System.out.println(animal1.equals(animal2));
        String string1="Hello";
        String string2="Hello";
        System.out.println(string1.equals(string2));


    }
}
