package Lesson45;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis= new FileInputStream("people.bin");
            ObjectInputStream ois= new ObjectInputStream(fis);
            //1 способ
          int personCoubt=ois.readInt();
          Person[] people=new Person[personCoubt];

          for (int i=0;i<personCoubt;i++){
              people[i]=(Person) ois.readObject();
          }

            System.out.println(Arrays.toString(people));
            // 2 способ
            Person[] people2=(Person[]) ois.readObject();

            System.out.println(Arrays.toString(people2));

            ois.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
