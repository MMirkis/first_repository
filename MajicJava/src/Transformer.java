import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Transformer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                List.of("", "a", "b", "ab", "ba", "z", "h", "", "heh", "")
        );

        // нужно получить [aa, bb, ab, ba, zz, hh, heh]
        transform(list);
        System.out.println(list);

    }


    public static void transform(List<String> words) {

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word == null || word.isEmpty()) {
                iterator.remove();
            }
        }

    }
}