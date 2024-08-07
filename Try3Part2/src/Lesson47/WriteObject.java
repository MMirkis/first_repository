package Lesson47;

import Lesson45.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args){
        Person person1= new Person(1,"Kek");

        try {
            FileOutputStream fos= new FileOutputStream("People2.bin");
            ObjectOutputStream oos= new ObjectOutputStream(fos);

            oos.writeObject(person1);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
