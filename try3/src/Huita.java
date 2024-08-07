interface Huita {
    public void eat();
}
/*
class Animal2 implements Huita {
    public void eat() {
        System.out.println("animal is eating");
    }
}

 */
 class Test4{
    public static void main(String[] args){
        Huita a = new Huita() {
            @Override
            public void eat() {
                System.out.println("Animal is eating");
            }
        };
        a.eat();
    }
}
