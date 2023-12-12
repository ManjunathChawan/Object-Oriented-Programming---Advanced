package com.generation;

public class Course {
    private String name;
    private int credits;
    private String professorName;

    public Course(String name, int credits, String professorName) {
        this.name = name;
        this.credits = credits;
        this.professorName = professorName;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getProfessorName() {
        return professorName;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
}
