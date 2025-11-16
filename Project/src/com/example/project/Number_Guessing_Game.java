package com.example.project;
import java.util.Scanner;
import java.util.Random;
public class Number_Guessing_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            System.out.println("\nChoose difficulty level:");
            System.out.println("1. Easy (1-50, 10 attempts)");
            System.out.println("2. Medium (1-100, 7 attempts)");
            System.out.println("3. Hard (1-200, 5 attempts)");
            System.out.print("Enter choice (1-3): ");
            int choice = scanner.nextInt();

            int maxRange = 100;
            int maxAttempts = 7;

            switch (choice) {
                case 1:
                    maxRange = 50;
                    maxAttempts = 10;
                    break;
                case 2:
                    maxRange = 100;
                    maxAttempts = 7;
                    break;
                case 3:
                    maxRange = 200;
                    maxAttempts = 5;
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Medium.");
            }

            int secretNumber = random.nextInt(maxRange) + 1;
            System.out.println("\nI'm thinking of a number between 1 and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            boolean guessedCorrectly = false;

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess (1-" + maxRange + "): ");
                int guess = scanner.nextInt();

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempt + " attempts. The number was " + secretNumber + ".");
                    guessedCorrectly = true;
                    break;
                } else if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The number was " + secretNumber + ".");
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            char response = scanner.next().toLowerCase().charAt(0);
            playAgain = (response == 'y');
        }

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
	}

}
