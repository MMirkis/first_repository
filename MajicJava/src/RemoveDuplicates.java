import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,2,4,5,3,6,7,5);
        Set<Integer> uNumbers=  new HashSet<>(numbers);
        System.out.println(uNumbers);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(2);
        set2.add(3);
        if(set1.containsAll(set2)){
            System.out.println("Явлеяется подмножеством");
        }else {
            System.out.println("Не является подмножеством");
        }
    }
}
