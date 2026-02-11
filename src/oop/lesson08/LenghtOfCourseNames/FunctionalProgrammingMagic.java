package oop.lesson08.LenghtOfCourseNames;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingMagic {
    public List<Integer> getCourseNameCharacterCount(List<String> courses){
        List<Integer> listOfCoursesNameLength = new ArrayList<Integer>();
        for (int i = 0; i< courses.size(); i++){
            listOfCoursesNameLength.add(courses.get(i).length());
        }

        return listOfCoursesNameLength;
    }
}
