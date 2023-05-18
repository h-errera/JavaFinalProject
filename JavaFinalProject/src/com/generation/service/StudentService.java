package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        //TODO implement
        // Retrieve the necessary information from the Student objects and print a summary
        // Use System.out.println() to print out the summary to the console

        // Iterate over the students and print a summary for each student
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId());
            System.out.println("Name: " + student.getName());

            List<Course> enrolledCourses = student.getEnrolledCourses();

            if (enrolledCourses.isEmpty()) {
                System.out.println("Enrolled Courses: None");
            } else {
                System.out.println("Enrolled Courses:");

                for (Course course : enrolledCourses) {
                    System.out.println("- " + course.getCourseCode() + ": " + course.getCourseName());
                }
            }

            System.out.println("------------");
        }
    }
}

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}


