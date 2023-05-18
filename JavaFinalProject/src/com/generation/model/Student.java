package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
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

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course ) {
        //TODO implement this method
        // Add the given course to the student's list of enrolled courses
        ArrayList<Object> enrolledCourses = null;
        if (enrolledCourses == null) {
            // Initialize the enrolledCourses list if it's null
            enrolledCourses = new ArrayList<>();
        }
        // Add the course to the enrolledCourses list
    }
        enrolledCourses.add(course);
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        // Check if the student is attending the course with the given course code
        Course[] enrolledCourses = new Course[0];

        if (enrolledCourses != null) {
            for (Course course : enrolledCourses) {
                if (course.getCourseCode().equals(courseCode)) {
                    // The student is attending the course with the given course code
                    return true;
                }
            }
        }
        // The student is not attending the course with the given course code
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

    public List<Course> getEnrolledCourses() {
        return null;
    }


}

