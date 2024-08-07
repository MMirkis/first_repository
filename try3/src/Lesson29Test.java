public class Lesson29Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        dog dog1 = new dog();
        Cate cate= new Cate();
        lesson29Test(animal);
        lesson29Test(cate);
        lesson29Test(dog1);



    }
    public static void lesson29Test(Animal animal){
        animal.eat();

    }

}
