import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Lesson34 {
    public static void main(String[] args) {
        List<Animal> ListOfAnimals = new ArrayList<>();
        ListOfAnimals.add(new Animal(1));
        ListOfAnimals.add(new Animal(2));
        test(ListOfAnimals);

        List<dog> ListOfDogs = new ArrayList<>();
        ListOfDogs.add(new dog());
        ListOfDogs.add(new dog());
        test(ListOfDogs);
    }
    private static void test(List<?extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
