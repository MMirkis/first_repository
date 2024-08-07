public class Animal {
    private int id;
    public void eat() {
        System.out.println("aNIMAL IS EATING");
    }
    public Animal(){

    }

    public Animal(int id) {
        this.id = id;
    }
    public String toString() {
        return String.valueOf(id);
    }

}
interface AbleToEat{
    public void eat();
}
 class TestEat{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Animal b = new Animal(){
          public void eat() {
              System.out.println("Other animal is eating");
          }
        };
        b.eat();


    }
}
