import oop.lesson08.ArrayListOfStudents.StudentManager;
import oop.lesson08.LenghtOfCourseNames.FunctionalProgrammingMagic;
import oop.lesson08.SimpleStudentClass.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // We initiliaze a new List<String> of programms
    FunctionalProgrammingMagic coursesProgramm = new FunctionalProgrammingMagic();
    List<String> courses = List.of("Math", "English", "History", "Physics");

    // We initiliaze a new List<Integer> for the programm because we are going to convert the programms into the number of character each one them holds
    List<Integer> resultListOne = coursesProgramm.getCourseNameCharacterCount(courses);
    for (int i = 0; i< resultListOne.size(); i++){
        System.out.print("["+resultListOne.get(i)+"] ");
    }

    // We are skipping a line so we can seperate the two output of the different code that we have in this package
    System.out.print("\n\n");

    // We initiliaze a new Student with his attribute and we print it out so we can the same output as the exercice provided
    Student studentOne = new Student("John", 20, 75.f);
    studentOne.displayStudentInformation();
    System.out.println("Passing: "+ studentOne.checkIfStudentPass());

    StudentManager studentPortal = new StudentManager();

    studentPortal.addStudent(new Student("Alice", 22, 85.0f));
    studentPortal.addStudent(new Student("Bob", 21, 45.0f));

    studentPortal.displayStudents();
    studentPortal.findStudent("Alice");
}
