package oop.lesson08.LenghtOfCourseNames;

import java.util.ArrayList;
import java.util.List;


public class FunctionalProgrammingMagic {

    //We create a method that it is a list a get the character count of the course name that have previsously been store in an array
    public List<Integer> getCourseNameCharacterCount(List<String> courses){
        List<Integer> listOfCoursesNameLength = new ArrayList<Integer>();

        // We loop through the current list of courses and for each one of them we get the count of character
        for (int i = 0; i< courses.size(); i++){
            listOfCoursesNameLength.add(courses.get(i).length());
        }

        return listOfCoursesNameLength;
    }
}
