package com.example.project;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

	}
}
