package Lesson43;

public class Electrocar {
    private int id;
    private static int power=99;

    //нестатический вложенный класс

    private class Motor{
        private void startMotor(){
            System.out.println("Motor "+id+" is vrum....");
        }
    }
    //статический вложенный

    public static  class Battery{
        public void charge(){
            System.out.println("Battery is eating.... Power is "+power+" %");
        }
    }

    public Electrocar(int id){
        this.id=id;
    }

    public void  start(){
        Motor motor=new Motor();
        motor.startMotor();
        //вложенный класс в методы
        final int x=1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);

            }
        }
        SomeClass someObject= new SomeClass();

        System.out.println("Electrocar "+id+" is starting....");
    }
}
