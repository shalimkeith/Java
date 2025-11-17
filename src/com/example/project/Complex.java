package com.example.project;

class Complex {
    private double real;
    private double imaginary;
h
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("Integer parameter: " + a);
    }

    void test(double a) {
        System.out.println("Double parameter: " + a);
    }

    void test(int a, int b) {
        System.out.println("Two integer parameters: " + a + ", " + b);
    }

    void test(Complex c1, Complex c2) {
        double realSum = c1.getReal() + c2.getReal();
        double imaginarySum = c1.getImaginary() + c2.getImaginary();
        Complex result = new Complex(realSum, imaginarySum);
        System.out.println("Sum of complex numbers: " + result);
    }
}