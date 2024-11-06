package storage;

import model.Student;

import java.io.*;
import java.util.List;

//lop nay tao ra chi dung de goi phuong thuc.
//co nhu cau tao 1 doi tuong duy nhat thuoc lop
//dung singleton de tao class
public class StudentStorage {
    private StudentStorage() {
    }
    private static StudentStorage instance;
    public static StudentStorage getInstance() {
        if (instance == null) {
            instance = new StudentStorage();
        }
        return instance;
    }

    //    ghi file: ghi ds student
    public void writeStudent(List<Student> students) {
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
    public List<Student> readStudents() {
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
