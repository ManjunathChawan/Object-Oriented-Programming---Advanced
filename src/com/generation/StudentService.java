package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    private HashMap<String, Course> courseList = new HashMap<>();
    private HashMap<String, Student> students = new HashMap<>();
    private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public StudentService() {
        // Initialization code
    }

    public void enrollStudents(String courseName, String studentID) {
        Course course = courseList.get(courseName);

        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.put(studentID, new ArrayList<>());
        }
        coursesEnrolledByStudents.get(studentID).add(course);
    }

    public void unEnrollStudents(String courseName, String studentID) {
        Course course = courseList.get(courseName);

        if (coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.get(studentID).remove(course);
        }
    }

    public void showEnrolledStudents(String courseId) {
        System.out.println("Students enrolled in course " + courseId + ":");
        for (Map.Entry<String, List<Course>> entry : coursesEnrolledByStudents.entrySet()) {
            String studentID = entry.getKey();
            List<Course> enrolledCourses = entry.getValue();

            for (Course course : enrolledCourses) {
                if (course.getName().equals(courseId)) {
                    System.out.println("Student ID: " + studentID + ", Name: " + students.get(studentID).getName());
                }
            }
        }
    }

    public void showAllCourses() {
        System.out.println("List of all courses:");
        for (Course course : courseList.values()) {
            System.out.println("Course Name: " + course.getName() + ", Credits: " + course.getCredits() +
                    ", Professor: " + course.getProfessorName());
        }
    }

    public void addStudent(Student student) {
    }
}
