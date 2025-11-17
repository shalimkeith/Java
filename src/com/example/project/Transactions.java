package com.example.project;


public class Transactions {
    public static void main(String[] args) {
        Account acc1 = new Account("001", "Shalim Keith");
        Account acc2 = new Account("002", "Ayesha");

        acc1.deposit(500000);
        acc1.withdraw(2000);
        acc1.displayAccountInfo();

        acc2.deposit(10000);
        acc2.withdraw(12000);
        acc2.displayAccountInfo();
    }
}

