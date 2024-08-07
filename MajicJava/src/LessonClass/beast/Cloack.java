package LessonClass.beast;

public class Cloack implements Invisible {
    private int capacity;
    private int weinght;

    public static void main(String[] args) {
        Cloack cloack = new Cloack(100, 100);
        if (cloack.getWeinght() <= cloack.getCapacity()) {
            cloack.becomeInvisible();
        } else cloack.becomeVisible();

    }

    public Cloack(int weinght, int capacity) {
        this.weinght = weinght;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeinght() {
        return weinght;
    }


    @Override
    public void becomeInvisible() {
        System.out.println("Cloack become invisible");
    }

    @Override
    public void becomeVisible() {
        System.out.println("Cloack become visible");
    }
}
