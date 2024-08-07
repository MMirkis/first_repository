package LessonClass.beast;

import java.util.Random;

public class Hippogriff {
    public static void main(String[] args) {
        Hippogriff luter = new Hippogriff("Luter");
        Hippogriff huter = new Hippogriff("Huter", 20, "Black blu", "Froz");
        Hippogriff luper = new Hippogriff();
        luper.setName("Luper");
        Hippogriff hippo = new Hippogriff("Hippo", "Purely white");
        System.out.println(huter.fly());
        huter.giveRide(new Student("Los", "giv", 10, new String[]{"lol", "hui", "lui"}));
    }

    private String name;
    private int age;
    private String color;
    private String skill;

    public Hippogriff() {
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Hippogriff(String name, int age, String color, String skill) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.skill = skill;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getSkill() {
        return skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(STR."Гиппогрив с радостью ест \{food}");
    }

    public String fly() {
        StringBuilder builder = new StringBuilder();
        String fly = "";
        if (this.age > 5) {
            builder.append("Гиппогриф ").append(this.name).append(" взлетел");
            ;
        } else builder.append("Гиппогриф ").append(this.name).append(" не взлетел");
        fly = builder.toString();
        return fly;
    }

    public String giveRide(Student student) {
        String ride = "";
        int isGivingRide = new Random().nextInt(1, 10);
        if (isGivingRide <= 3) {
            ride = STR."\{student.getName()} летит на гиппогрифе!";
        } else if (isGivingRide > 3) {
            if (isGivingRide <= 8) {
                ride = STR."\{student.getName()} гиппогриф демонстративно отворачивается и отказывается летать";
            }
        } else ride = "Попробуй еще раз";
        System.out.println(ride);
        return ride;
    }
}
