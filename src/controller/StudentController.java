package controller;

import model.Student;
import storage.StudentStorage;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    public static List<Student> students = StudentStorage.readStudents();

    public void add(Student student) {
        students.add(student);
        StudentStorage.writeStudent(students);
    }


}
