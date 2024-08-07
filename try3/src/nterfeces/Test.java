package nterfeces;

public class Test {
    public static void main(String[] args){
        info info1=new Animal(1);
        info info2=new Person("hui");
        Animal animal= new Animal(1);
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);
        outputInfo(animal);
    }
    public static void outputInfo(info info){
        info.showInfo();
    }
}
