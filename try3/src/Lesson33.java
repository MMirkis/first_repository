
import java.util.List;
import java.util.ArrayList;
public class Lesson33 {
    public static void main(String[] args) {
        ////до джава 5
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        String animal=(String) animals.get(1);
        System.out.println(animal);
        /////с появление джинериков
        List<String> animals2=new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("bird");
        String animal2=(String) animals2.get(1);
        System.out.println(animal2);
        /////джава7
        List<String> animals3=new ArrayList<>();
    }
}
