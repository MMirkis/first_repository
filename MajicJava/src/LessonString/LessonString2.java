package LessonString;

import java.util.Random;

public class LessonString2 {
    public static void main(String[] args) {
        casSpell();

    }
    public static void casSpell(){
        StringBuilder spell=new StringBuilder();
        String substring;
        int start= new Random().nextInt(0,50);
        String hightReg="ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA.";
        hightReg=hightReg.toLowerCase();
        substring=hightReg.substring(start);
        spell= new StringBuilder(substring);
        spell=spell.reverse();
        String one= String.valueOf(spell.charAt(0));
        String two= String.valueOf(spell.charAt(1));
        spell.replace(0, 1, String.valueOf(two));
        spell.replace(1,2, String.valueOf(one));
        System.out.println(spell);

    }
}
