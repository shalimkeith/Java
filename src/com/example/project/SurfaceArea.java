package com.example.project;

public class SurfaceArea {

    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2, 3, 4);
        Box box3 = new Box(2, 3, 4);

        System.out.println("Box1 Volume: " + box1.volume());
        System.out.println("Box1 Surface Area: " + box1.getSurfaceArea());

        System.out.println("Box2 Volume: " + box2.volume());
        System.out.println("Box2 Surface Area: " + box2.getSurfaceArea());

        System.out.println("Box3 Volume: " + box3.volume());
        System.out.println("Box3 Surface Area: " + box3.getSurfaceArea());

        System.out.println("Box2 equals Box3? " + box2.isEqual(box3));
        System.out.println("Box1 equals Box2? " + box1.isEqual(box2));
    }
}
