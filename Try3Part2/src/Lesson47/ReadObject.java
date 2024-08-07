package Lesson47;

import Lesson45.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream("People2.bin")) ){
            Person person1=(Person) ois.readObject();
            System.out.println(person1);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
