package com.example.project;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Invalid dimensions. Setting length and width to 0.");
            this.length = 0;
            this.width = 0;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width && length > 0;
    }

    public void displayRectangleInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Is Square: " + isSquare());
        System.out.println("---------------------------");
    }
}