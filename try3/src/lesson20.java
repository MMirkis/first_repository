import javax.xml.namespace.QName;

public class lesson20 {
    public static void main(String[] args) {
        Human1 h1 = new Human1(18, "BOBS");
        Human1 h2 = new Human1();
        h1.toString();
        System.out.println(h1);
        Human1.printCountPeople();

    }
}

class Human1 {
    private int age;
    private String name;
    private static int countPeople;

    public Human1(int useAge, String name) {
        System.out.println("hello for 3 constructor");
        this.age = age;
        this.name = name;
        countPeople++;
    }

    public Human1(){
        System.out.println("huy");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void printCountPeople() {
        System.out.println("Number of people is : " + countPeople);
    }
    public String toString() {
        return name+","+age;
    }
}