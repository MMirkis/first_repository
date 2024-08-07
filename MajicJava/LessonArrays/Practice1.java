package LessonArrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        String[] recipe = {"Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"};

// Порядок добавления: Капля сока вампирской розы,
// Слеза феникса, Засушенная чешуя василиска, Частичка души лесной феи,
// Яд шершавого ядозуба, Осколок кометы
        String[] potion= new String[6];
        potion[2]=recipe[2];
        potion[5]=recipe[5];
        potion[0]=recipe[0];
        potion[1]=recipe[1];
        potion[3]=recipe[3];
        potion[4]=recipe[4];
        System.out.println(Arrays.equals(potion, recipe));
    }


}
