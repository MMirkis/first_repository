package nterfeces;

public class Animal implements info {
    public int id;

    public Animal(int id){
        this.id=id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }
    public void showInfo(){
        System.out.println("Id is"+this.id);
    }

}
