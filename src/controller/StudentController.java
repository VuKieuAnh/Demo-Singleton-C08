package controller;

import model.Student;
import storage.StudentStorage;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    static StudentStorage studentStorage = StudentStorage.getInstance();
    public static List<Student> students = studentStorage.readStudents();

    public void add(Student student) {
        students.add(student);
        studentStorage.writeStudent(students);
    }


}
