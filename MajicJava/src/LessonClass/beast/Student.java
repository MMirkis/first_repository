package LessonClass.beast;

import java.util.Map;

public class Student {
    public static void main(String[] args) throws SpellCastException {
        Student student = new Student("Los", "giv", 12, new String[]{"lol", "hui", "lui"});
        Spell spell=new Spell("авыдпджы",3);
        student.castSpell(spell);
    }

    private Map<Integer, Integer> map;
    private String name;
    private String facultet;
    private int age;
    private String[] skills = new String[3];

    public Student(String name, String facultet, int age, String[] skills) {
        this.name = name;
        this.facultet = facultet;
        this.age = age;
        this.skills = skills;
        this.map=Map.of(11,1,12,2,13,3,14,4);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFacultet() {
        return facultet;
    }

    public int getAge() {
        return age;
    }

    public String[] getSkills() {
        return skills;
    }


    public void castSpell(Spell spell) throws SpellCastException {
        if (this.map.get(this.age)>=spell.getPower()){
            System.out.println(this.name + " использовал заклинание " + spell.getTitle());
        }else {
            throw new SpellCastException(this.name + " еще слишком юни для того, чтобы использовать " + spell.getTitle());
        }
    }
}
