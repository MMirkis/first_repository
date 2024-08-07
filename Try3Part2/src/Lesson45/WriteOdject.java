package Lesson45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteOdject {
    public static void main(String[] args) {

        Person[]people={new Person(1,"lov"),new Person(2,"dob"), new Person(3,"lox")};
        Person[]people2={new Person(1,"lov"),new Person(2,"dob"), new Person(3,"lox")};
        //1 способ
        try {
            FileOutputStream fos= new FileOutputStream("people.bin");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for(Person person:people){
                oos.writeObject(person);
            }
            //2 способ
            oos.writeObject(people2);

            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
