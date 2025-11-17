package com.example.project;

public class CalculatorApp {
    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        demo.test();
        demo.test(5);
        demo.test(3.14);
        demo.test(2, 7);

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 6);
        demo.test(c1, c2);
    }
}