package com.example.project;

public class Instructor extends Course {
    private String instructorName;
    protected String department;
    private Course course;

    public Instructor(String instructorName, String department) {
        super("", "");
        this.instructorName = instructorName;
        this.department = department;
    }

    public Instructor(String instructorName, String department, Course course) {
        super(course.getCourseName(), course.getCourseID(), course.getCredits());
        this.instructorName = instructorName;
        this.department = department;
        this.course = course;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDetails() {
        if (course != null) {
            return "Instructor: " + instructorName + " | Department: " + department + 
                   " | " + course.getDetails();
        } else {
            return "Instructor: " + instructorName + " | Department: " + department;
        }
    }
}