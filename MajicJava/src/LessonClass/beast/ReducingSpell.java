package LessonClass.beast;

public class ReducingSpell extends Spel{
    public ReducingSpell(String name, String efect, boolean status) {
        super(name, efect, status);
    }


    @Override
    public void doMagic() {
        System.out.println("Было применено заклинание меньшения ");

    }

}
