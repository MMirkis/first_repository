package LessonArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Potion {
    public static void main(String[] args) {
        Potion potion=new Potion();
        potion.prepare();
    }
    public boolean prepare(){
        Scanner scanner=new Scanner(System.in);
        String[] ingredients=new String[3];
        ingredients[0] ="Драконий коготь";
        ingredients[1]="Лист мандрагоры";
        ingredients[2]="Корень шершавой астрелии";
        System.out.println("Добро пожаловать в лабораторию зелий!\nВведите ингредиенты, которые у вас есть (через запятую):");
        String input=scanner.nextLine();
        String[] userIngredients=input.split(",");
        System.out.println(Arrays.toString(userIngredients));
        int correcIngredients=0;
        Arrays.sort(userIngredients);
        for (int i=0; i<ingredients.length ;i++ ){
            int index= Arrays.binarySearch(userIngredients,ingredients[i]);
            if (index >= 0) {
                correcIngredients ++;
                System.out.println(index);
            }
        }
        if (correcIngredients>=3){
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
        }else System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");

        return true;


    }
}
