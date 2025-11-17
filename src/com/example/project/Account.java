package com.example.project;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String id, String accountHolderName,double balance) {
        this.accountNumber = id;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public Account(int id, String string) {
		// TODO Auto-generated constructor stub
	}

	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }
}

