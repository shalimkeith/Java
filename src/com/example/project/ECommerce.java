package com.example.project;

public class ECommerce {

    public void processPayment() {
        System.out.println("Processing default payment.");
    }

    public void processPayment(int amount) {
        System.out.println("Processing payment of amount " + amount + ".");
    }

    public void processPayment(int amount, String customerName) {
        System.out.println("Processing payment of " + amount + " for " + customerName + ".");
    }

    public static void main(String[] args) {
        ECommerce processor = new ECommerce();
        processor.processPayment();
        processor.processPayment(5000);
        processor.processPayment(7500, "Shalim");
    }
}
