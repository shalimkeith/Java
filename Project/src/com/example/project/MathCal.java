package com.example.project;
import java.util.Date;
import java.util.Scanner;

public class MathCal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date currentDate = new Date();
        System.out.println(" Current Date and Time: " + currentDate);

        System.out.print("\nEnter a number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter an exponent to raise the number to: ");
        double exponent = scanner.nextDouble();

        double sqrt = Math.sqrt(number);
        double sine = Math.sin(number);
        double cosine = Math.cos(number);
        double tangent = Math.tan(number);
        double power = Math.pow(number, exponent);
        double random = Math.random(); // between 0.0 and 1.0

        System.out.println("\n Math Operations:");
        System.out.printf("Square Root: %.2f\n", sqrt);
        System.out.printf("Sine: %.4f\n", sine);
        System.out.printf("Cosine: %.4f\n", cosine);
        System.out.printf("Tangent: %.2f\n", tangent);
        System.out.printf("Power (%.2f ^ %.2f): %.2f\n", number, exponent, power);
        System.out.printf("Random Number (0 to 1): %.2f\n", random);
    }
}