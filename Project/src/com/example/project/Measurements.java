package com.example.project;

public class Measurements {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);
        Rectangle rect3 = new Rectangle(7, 7);
        Rectangle rect4 = new Rectangle(-3, 4);

        rect1.displayRectangleInfo();
        rect2.displayRectangleInfo();
        rect3.displayRectangleInfo();
        rect4.displayRectangleInfo();
    }
}