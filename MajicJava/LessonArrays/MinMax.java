package LessonArrays;

import java.util.Arrays;
import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        MinMax minMax=new MinMax();
        int[] massiv=minMax.generingArray();
        System.out.println(Arrays.toString(massiv));
        serchMin(massiv);
        sertchMax(massiv);
    }

    public static void serchMin(int[] massiv){
        int min=0;
        for (int i = 0; i<massiv.length; i++){
            if (min>massiv[i]){
                min=massiv[i];
            }
        }
        System.out.println(min);

    }
    public int[] generingArray(){
        int[] array=new int[12];
        for (int i=0;i<array.length;i++){
            array[i]= new Random().nextInt();
        }
        return array;
    }
    public static void sertchMax(int[] massiv){
        int max=0;
        for (int i=0; i<massiv.length;i++){
            if (max<massiv[i]){
                max=massiv[i];
            }

        }
        System.out.println(max);
    }
}

