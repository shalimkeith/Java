package com.example.project;

public class Student {
    private String name;
    private int rollNumber;
    private double[] grades;

    public Student(String name, int rollNumber, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nAverage Grade: " + calculateAverage());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        double[] grades1 = {85.5, 90.0, 78.0};
        double[] grades2 = {70.0, 65.5, 80.0, 75.0};
        double[] grades3 = {92.0, 88.5, 95.0};

        Student student1 = new Student("Ali", 101, grades1);
        Student student2 = new Student("Shalim", 102, grades2);
        Student student3 = new Student("Keith", 103, grades3);

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}

