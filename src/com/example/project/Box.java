package com.example.project;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return width * height * depth;
    }

    public double getSurfaceArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public boolean isEqual(Box otherBox) {
        return this.width == otherBox.width &&
               this.height == otherBox.height &&
               this.depth == otherBox.depth;
    }
}
