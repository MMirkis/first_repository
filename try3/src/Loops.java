public class Loops {
    public static void main(String[] args) {
        int value=9;
        boolean t =false;
        while (t==false){
            System.out.println("Hello "+ value);
            value=value-1;
            if(value==5){
                t=true;
            }


        }
        for (int i=10;i>=0;i=i-1){
            System.out.println(i);

        }
    }


}
