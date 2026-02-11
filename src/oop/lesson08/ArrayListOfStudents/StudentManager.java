package oop.lesson08.ArrayListOfStudents;

import oop.lesson08.SimpleStudentClass.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("All Students:");
        for (Student elem : students) {
            System.out.println(elem);
        }
    }

    public void findStudent(String name) {
        for (Student elem : students) {
            if (elem.name.equals(name)) {
                System.out.println("Found: " + elem.name);
                return;
            }
        }
    }
}
