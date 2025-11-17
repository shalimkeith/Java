package com.example.project;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", "70242", 3);
        Instructor i1 = new Instructor("Shalim Keith", "Computer Science", c1);

        System.out.println(c1.getDetails());
        System.out.println(i1.getDetails());

        Instructor i2 = new Instructor("Umat Ul Shaiya", "Object Oriented Programming");
        System.out.println(i2.getDetails());
    }
}