public class CLass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Kurva");
        person1.setAge(23);
        System.out.println("Выводим значение в main  методе: " + person1.getName());
        System.out.println("Выводим значение в main  методе: " + person1.getAge());
        person1.speak();
        Person person2 = new Person();
        person2.setName("Karova");
        person2.setAge(100);

        person2.speak();



    }
}
class Person{
    private String name;
    private int age;



    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("Ты ввесл пустое имя ");
        }else {
            name = username;
        }
    }


    public String getName() {
        return name;
    }
    public void setAge(int userage){
        if (userage<0){
            System.out.println("Вам не может быть меньше нуля ");
        }else {
            age = userage;
        }
    }

    public int getAge() {
        return age;
    }

    int  calculateYearsToRetirenent(){
        int years = 65-age;
        return years;
      }
    void speak(){
        for (int i=0;i<1;i++) {
            seyHello();
            System.out.println("Меня зовут " + getName() + " Мне " + getAge());

        }
    }
    void seyHello(){
        System.out.println("Привет!");
    }
}
