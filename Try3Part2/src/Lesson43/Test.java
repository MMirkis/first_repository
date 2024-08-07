package Lesson43;

public class Test {

    public static void main(String[] args){
        Electrocar electrocar1=new Electrocar(1);
        electrocar1.start();
        Electrocar.Battery battery=new Electrocar.Battery();
        battery.charge();
    }
}
