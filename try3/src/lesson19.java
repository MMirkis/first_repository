public class lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName( "Human1");
        human1.setAge( 23);
        human1.getInfo();
    }
}
class Human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name+","+age);
    }
}