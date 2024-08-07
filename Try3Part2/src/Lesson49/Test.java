package Lesson49;

public class Test {
    public static void main(String[] args) {

        System.out.println(someMethod(20));
    }
    private static long   someMethod(int n){
    if (n==1)
        return 1;

    return n* someMethod(n-1);
    }
}
