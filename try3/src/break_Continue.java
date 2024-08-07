public class break_Continue {
    public static void main(String[] args) {
        int i=0;
        while (true){
            System.out.println(i);
            i++;
            if (i==15){
                break;
            }
        }
        System.out.println("Мы вышли из цикла");
        for (int i1 = 0; i1 <= 15; i1++){
            if (i1%2==0){
                continue;
            }
            System.out.println("это не четное число"+i1);
        }
    }

}
