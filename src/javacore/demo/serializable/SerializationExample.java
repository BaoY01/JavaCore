package javacore.demo.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) {
        // Create Student object
        Student student = new Student();
        student.setName("BaoY");
        student.setAge(21);
        // Use FileOutputStream to save the Student object into a file
        try ( FileOutputStream fos = new FileOutputStream("student.txt");
              ObjectOutputStream oos = new ObjectOutputStream(fos); ) {
            oos.writeObject(student);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
