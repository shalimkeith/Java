package com.example.project;
import java.util.Scanner;

public class Weathercal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current temperature in °C: ");
        int temperature = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Is it 'rainy' or 'sunny'? ");
        String weather = scanner.nextLine().trim().toLowerCase();

        if (temperature < 0) {
            if (weather.equals("rainy")) {
                System.out.println("Wear a heavy coat and take an umbrella.");
            } else if (weather.equals("sunny")) {
                System.out.println("Wear a heavy coat and sunglasses.");
            }
        } else if (temperature >= 0 && temperature <= 10) {
            if (weather.equals("rainy")) {
                System.out.println("Wear a warm jacket and take an umbrella.");
            } else if (weather.equals("sunny")) {
                System.out.println("Wear a warm jacket and sunglasses.");
            }
        } else if (temperature >= 11 && temperature <= 20) {
            if (weather.equals("rainy")) {
                System.out.println("Wear a light jacket and take an umbrella.");
            } else if (weather.equals("sunny")) {
                System.out.println("Wear a light jacket and sunglasses.");
            }
        } else if (temperature > 20) {
            if (weather.equals("rainy")) {
                System.out.println("Wear light clothing and take an umbrella.");
            } else if (weather.equals("sunny")) {
                System.out.println("Wear light clothing and sunglasses.");
            }
        } else {
            System.out.println("Invalid input. Please check your entries.");
        }
    }
}
