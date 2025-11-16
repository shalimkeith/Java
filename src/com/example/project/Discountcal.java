package com.example.project;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Discountcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Print the original price of the product: ");
		double originalPrice = scanner.nextDouble();
		
		System.out.println("Print the discount percentage of the product: ");
		double discountPercent = scanner.nextDouble();
		
		double discountAmount = originalPrice*(discountPercent/100);
		double finalPrice = originalPrice - discountAmount;
		
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String transactionTime = now.format(formatter);
        
        System.out.println("\n Transaction Summary\n");
        System.out.println("original price:" + originalPrice);
        System.out.println("discount price:" + discountAmount);
        System.out.println("final price:" + finalPrice);
        System.out.println("Transaction date " + transactionTime);
        
	}

}
