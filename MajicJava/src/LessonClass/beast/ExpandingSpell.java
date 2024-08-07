package LessonClass.beast;

public class ExpandingSpell extends Spel{
    public ExpandingSpell(String name, String efect, boolean status) {
        super(name, efect, status);
    }

    @Override
    public void doMagic() {
        System.out.println("Применено заклинание увелечения ");
    }
}
