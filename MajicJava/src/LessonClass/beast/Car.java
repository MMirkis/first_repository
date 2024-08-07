package LessonClass.beast;

public class Car implements Invisible {
    private Student driver;
    private int speed;
    private final boolean isFlying;

    public static void main(String[] args) {
        Student student = new Student("Los", "giv", 10, new String[]{"lol", "hui", "lui"});
        Car car = new Car(student, 100, true);
        if (car.isFlying) {
            car.becomeInvisible();
        } else car.becomeVisible();
    }



    public Car(Student driver, int speed, boolean isFlying) {
        this.driver = driver;
        this.speed = speed;
        this.isFlying = isFlying;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public void becomeInvisible() {
        System.out.println("Car become invisible");
    }

    @Override
    public void becomeVisible() {
        System.out.println("Car become visible");

    }
}
