package view;

import controller.StudentController;
import model.Student;

import java.util.Scanner;

public class Main {
    private static StudentController studentController = new StudentController();
    public static void main(String[] args) {

        System.out.println(studentController.students);
        Student s1 = addNewStudent();
        studentController.add(s1);
        System.out.println(studentController.students);
    }

    public static Student addNewStudent(){
        System.out.println("Moi ban nhap vao id");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        System.out.println("Moi ban nhap vao ten");
        String name = scanner.next();
        Student student = new Student(id, name);
        return student;
    }
}
