package storage;

import model.Student;

import java.io.*;
import java.util.List;

public class StudentStorage {
//    ghi file: ghi ds student
    public static void writeStudent(List<Student> students) {
//        s.dat
        File file = new File("students.txt");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    doc file
    public static List<Student> readStudents() {
        File file = new File("students.txt");
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(file));
            Object o = os.readObject();
            return (List<Student>) o;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
