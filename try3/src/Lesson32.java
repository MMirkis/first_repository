public class Lesson32 {
    public static void main(String[] args) {
        dog dog1 = new dog();
        //upcasting-восходящее преобразование(неявное)
        Animal animal =  dog1;
        //downcasting-нисходящее преобразование(явное)
        dog dog2=(dog)animal;
        dog2.bark();

    }
}
