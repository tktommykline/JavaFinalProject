package com.generation.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, int birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        course = approvedCourses.put(courses.get(courses.get(courses.code), courses.get(courses.get(courses.name)); //add the courses from the CourseService page to the approvedCourses hashmap
        courses.add(course.name); //add the approved courses to the students courses ArrayList
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).name){
                return true;
            } // loop through the ArrayList and if there is an entry return true and assume the student is attending this course.
        }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}
