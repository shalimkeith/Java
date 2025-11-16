package com.example.project;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter amount ran on Monday: ");
        double mon = scanner.nextDouble();
        
        System.out.print("Enter amount ran on Tuesday: ");
        double tue = scanner.nextDouble();

        System.out.print("Enter amount ran on Wednesday: ");
        double wed = scanner.nextDouble();

        System.out.print("Enter amount ran on Thursday: ");
        double thu = scanner.nextDouble();

        System.out.print("Enter amount ran on Friday: ");
        double fri = scanner.nextDouble();

        System.out.print("Enter amount ran on Saturday: ");
        double sat = scanner.nextDouble();

        System.out.print("Enter amount ran on Sunday: ");
        double sun = scanner.nextDouble();
        
        double totalDistance = mon + tue + wed + thu + sat + sun + fri;
        
        System.out.println("Total Distance Ran Through The Week " + totalDistance);
	}

}
