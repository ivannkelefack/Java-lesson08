package oop.lesson08.ArrayListOfStudents;
import oop.lesson08.SimpleStudentClass.Student;
import java.util.ArrayList;
import java.util.List;

// We initiliaze the new Array which is a list of Student. We use the Student Class since the structure is the one that we need
public class StudentManager {

    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    // We create a method to add the new student with there information into the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // We create a method to display all the student that have been added before into the array list
    public void displayStudents() {
        System.out.println("All Students:");
        for (Student elem : students) {
            System.out.println(elem);
        }
    }

    // We create a method to find a student that we request into the array list
    public void findStudent(String name) {
        for (Student elem : students) {
            if (elem.name.equals(name)) {
                System.out.println("Found: " + elem.name);
                return;
            }
        }
    }
}
