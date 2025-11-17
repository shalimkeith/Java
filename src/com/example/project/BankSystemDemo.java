package com.example.project;

public class BankSystemDemo {
    public static void main(String[] args) {
        Customer regular = new Customer(1000.0);
        VIPCustomer vip = new VIPCustomer(5000.0);

        System.out.println("Regular Customer Balance: " + regular.getBalance());
        System.out.println("VIP Customer Balance: " + vip.getBalance());

        regular.setBalance(2000.0);
        System.out.println("Updated Regular Balance: " + regular.getBalance());

        vip.setBalance(-1000.0);
        System.out.println("Updated VIP Balance: " + vip.getBalance());
    }
}