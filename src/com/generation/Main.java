package com.generation;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // Add students using encapsulation
        studentService.addStudent(new Student("Carlos", "1030", 31));
        studentService.addStudent(new Student("Ian", "1020", 28));
        studentService.addStudent(new Student("Elise", "1020", 26));
        studentService.addStudent(new Student("Santiago", "1020", 33));

        // Enroll a student in a course using encapsulation
        studentService.enrollStudents("Math", "1030");
    }
}
