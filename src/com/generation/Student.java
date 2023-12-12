package com.generation;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private int age;
    private final List<Course> courseList = new ArrayList<>();

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getStudentID() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourseList() {
        return new ArrayList<>(courseList); // Return a copy to avoid direct manipulation
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods for manipulating courseList
    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(Course course) {
        courseList.remove(course);
    }
}
