package com.example.project;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter First No: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second No: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter The Operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
            	result = num1/num2;
            	break;
        }

        if (valid) {
            System.out.printf("Result: %.2f\n", result);
        }
    }
}
