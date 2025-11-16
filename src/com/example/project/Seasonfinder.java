package com.example.project;
import java.util.Scanner;

public class Seasonfinder {
    public static void main(String[] args) {
    	
    	        Scanner input = new Scanner(System.in);
    	        System.out.print("Enter month (1-12): ");
    	        int month = input.nextInt();

    	        if (month == 12 || month == 1 || month == 2) {
    	            System.out.println("Season: Winter");
    	        } else if (month >= 3 && month <= 5) {
    	            System.out.println("Season: Spring");
    	        } else if (month >= 6 && month <= 8) {
    	            System.out.println("Season: Summer");
    	        } else if (month >= 9 && month <= 11) {
    	            System.out.println("Season: Fall");
    	        } else {
    	            System.out.println("Invalid month entered.");
    	        }
    		}
    	}

