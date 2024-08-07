
package Lesson48;

public class Test {
    public static void main(String[] args) {
        Animal animal=Animal.CAT;
        Season sumer=Season.SUMMER;
        System.out.println(animal.getTranslation());
        System.out.println(Animal.DOG.toString());

        switch (animal){
            case CAT -> System.out.println("It's a cat");
            case DOG -> System.out.println("It's a dog");
        }
        //Object-> Enum-> Season
        switch (sumer){
            case SUMMER -> System.out.println("It's warm outside "+ sumer.getTemperatur());
            case WINTER -> System.out.println("It's cold outside ");
            case AUTOWMN -> System.out.println("It's basic");
            case SPRING -> System.out.println("Tt's very good");
        }
        //полезные методы
        Season season1= Season.AUTOWMN;
        System.out.println(season1.name());//выводит название текущей константы тип String
        Animal cat=Animal.valueOf("CAT");//из страки получаем enum
        sumer.ordinal();//выводит индекс в котором объявлялась перменная в enum
    }
}
