package oop.lesson08.SimpleStudentClass;

// We set the Properties: name, age, grade
public class Student {
    public String name;
    private int age;
    private float grade;

    // We build the constructor, while initializing our propreties.
    public Student (String name, int age, float grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // We use this method to display the student information
    public void displayStudentInformation(){
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    // We use this method to check if the student grade is greater or equal than 50
    public boolean checkIfStudentPass(){
        if (grade >= 50){
            return true;
        }
        return false;
    }

    // Use this method so I can print the values and not the address
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
