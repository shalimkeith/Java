package com.example.project;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is the Student's Marks: ");
		int marks = scanner.nextInt();
		
		if (marks>=50 ) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
