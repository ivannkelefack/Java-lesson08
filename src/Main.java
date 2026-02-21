import oop.lesson08.ArrayListOfStudents.StudentManager;
import oop.lesson08.LenghtOfCourseNames.FunctionalProgrammingMagic;
import oop.lesson08.LinkedListOfTasks.TaskManager;
import oop.lesson08.SetOfUniqueStudentsAndAdvanced.StudentRegistry;
import oop.lesson08.SimpleStudentClass.Student;

// ADD THESE IMPORTS
import java.util.*;

// If your classes are in same package or default, no extra import needed
// Otherwise adjust package names if required

void main() {

    // ================= EXERCISE (Functional Programming) =================
    System.out.println("Exercise 0:");
    FunctionalProgrammingMagic coursesProgramm = new FunctionalProgrammingMagic();
    List<String> courses = List.of("Math", "English", "History", "Physics");

    List<Integer> resultListOne = coursesProgramm.getCourseNameCharacterCount(courses);
    for (int i = 0; i < resultListOne.size(); i++) {
        System.out.print("[" + resultListOne.get(i) + "] ");
    }

    System.out.print("\n\n");

    // ================= EXERCISE 1 =================
    System.out.println("Exercise 1:");
    Student studentOne = new Student("John", 20, 75.f);
    studentOne.displayStudentInformation();
    System.out.println("Passing: " + studentOne.checkIfStudentPass());

    System.out.print("\n");

    // ================= EXERCISE 2 =================
    System.out.println("Exercise 2:");
    StudentManager studentPortal = new StudentManager();

    studentPortal.addStudent(new Student("Alice", 22, 85.0f));
    studentPortal.addStudent(new Student("Bob", 21, 45.0f));

    studentPortal.displayStudents();
    studentPortal.findStudent("Alice");

    System.out.print("\n\n");

    // ================= EXERCISE 3 =================
    System.out.println("Exercise 3:");

    Map<String, List<Student>> courseMap = new HashMap<>();

    courseMap.put("Math", new ArrayList<>());
    courseMap.put("Physics", new ArrayList<>());

    courseMap.get("Math").add(new Student("Alice", 22, 85.0f));
    courseMap.get("Math").add(new Student("Bob", 21, 70.0f));
    courseMap.get("Physics").add(new Student("Charlie", 23, 90.0f));

    // Display student count per course
    for (String course : courseMap.keySet()) {
        System.out.println("Course: " + course + ", Students: " + courseMap.get(course).size());
    }

    System.out.println("All Courses:");
    for (String course : courseMap.keySet()) {
        System.out.println("Course: " + course + ", Students: " + courseMap.get(course).size());
    }

    System.out.print("\n");

    // ================= EXERCISE 4 =================
    System.out.println("Exercise 4:");

    TaskManager manager = new TaskManager();

    manager.addTask(new TaskManager.Task("Buy groceries", 1));
    manager.addTask(new TaskManager.Task("Study Java", 2));
    manager.addTask(new TaskManager.Task("Clean room", 3));

    manager.markTaskCompleted("Study Java");
    manager.sortTasksByPriority();

    manager.displayAllTasks();
    manager.displayCompletedTasks();

    System.out.print("\n");

    // ================= EXERCISE 5 =================
    System.out.println("Exercise 5:");

    StudentRegistry registry = new StudentRegistry();

    StudentRegistry.Student s1 = new StudentRegistry.Student("Alice", 22, 85);
    StudentRegistry.Student s2 = new StudentRegistry.Student("Bob", 21, 70);
    StudentRegistry.GraduateStudent s3 =
            new StudentRegistry.GraduateStudent("Charlie", 25, 90, "Machine Learning");

    registry.addStudent(s1);
    registry.addStudent(s2);
    registry.addStudent(s3);

    registry.displayStudents();
    registry.displaySortedStudents();

    System.out.println("Student exists (Alice): " + registry.studentExists(s1));
}
