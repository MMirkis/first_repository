public class Arrays_of_Strings {
    public static void main (String[] args){
        int[]numbers=new int[5];
        numbers[0]=10;
        System.out.println(numbers[0]);
        String[] strings= new String[3];
        strings[0]="здарова";
        strings[1]="java";
        strings[2]="zaebal";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for (int i=0; i< strings.length; i++){
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string:strings){
            System.out.println(string);
        }
        int[] numbers1={1,2,3};
        int sum=0;
        for (int x:numbers1){
            sum+=x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
