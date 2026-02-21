package oop.lesson08.MapOfCoursesAndStudents;

import oop.lesson08.SimpleStudentClass.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CourseManager {

    private Map<String, ArrayList<Student>> courses;

    // Constructor initializes the map
    public CourseManager() {
        courses = new HashMap<>();
    }

    // Adds a student to a specific course
    public void addStudentToCourse(String courseName, Student student) {
        if (!courses.containsKey(courseName)) {
            courses.put(courseName, new ArrayList<>());
        }
        courses.get(courseName).add(student);
    }

    // Displays student count per course
    public void displayCourseStudentCount() {
        for (String course : courses.keySet()) {
            System.out.println("Course: " + course + ", Students: " + courses.get(course).size());
        }
    }

    // Displays all courses and their student counts
    public void displayAllCourses() {
        System.out.println("All Courses:");
        for (String course : courses.keySet()) {
            System.out.println("Course: " + course + ", Students: " + courses.get(course).size());
        }
    }
}
