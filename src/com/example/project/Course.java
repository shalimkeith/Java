package com.example.project;

public class Course {
    private String courseName;
    private String courseID;
    protected int credits;

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = 0;
    }

    public Course(String courseName, String courseID, int credits) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public int getCredits() {
        return credits;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDetails() {
        return "Course: " + courseName + " (ID: " + courseID + ")";
    }
}