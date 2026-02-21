package oop.lesson08.SetOfUniqueStudentsAndAdvanced;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class StudentRegistry {

    // Base Student class implementing Comparable
    public static class Student implements Comparable<Student> {
        String name;
        int age;
        float grade;

        // Constructor initializes student properties
        public Student(String name, int age, float grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        // Compares students by name
        @Override
        public int compareTo(Student other) {
            return this.name.compareTo(other.name);
        }

        // Ensures uniqueness in HashSet (based on name)
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Student)) return false;
            Student other = (Student) obj;
            return this.name.equals(other.name);
        }

        // Hash code based on name
        @Override
        public int hashCode() {
            return name.hashCode();
        }

        // Returns formatted student info
        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
        }
    }

    // GraduateStudent subclass (inheritance)
    public static class GraduateStudent extends Student {
        String researchTopic;

        // Constructor initializes graduate student
        public GraduateStudent(String name, int age, float grade, String researchTopic) {
            super(name, age, grade);
            this.researchTopic = researchTopic;
        }

        // Returns formatted graduate student info
        @Override
        public String toString() {
            return "GraduateStudent{name='" + name + "', age=" + age + ", grade=" + grade +
                    "} Research Topic: " + researchTopic;
        }
    }

    private Set<Student> students = new HashSet<>();

    // Adds a student to the HashSet (no duplicates)
    public void addStudent(Student student) {
        students.add(student);
    }

    // Checks if a student exists in the set
    public boolean studentExists(Student student) {
        return students.contains(student);
    }

    // Displays all students using enhanced for loop
    public void displayStudents() {
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println("  " + s);
        }
    }

    // Displays sorted students using TreeSet and iterator
    public void displaySortedStudents() {
        System.out.println("Sorted Students:");
        Set<Student> sorted = new TreeSet<>(students);

        Iterator<Student> it = sorted.iterator();
        while (it.hasNext()) {
            System.out.println("  " + it.next());
        }
    }
}
