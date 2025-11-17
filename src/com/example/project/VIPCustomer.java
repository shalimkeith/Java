package com.example.project;

public class VIPCustomer extends Customer {
    public VIPCustomer(double balance) {
        super(balance);
    }

    @Override
    protected void setBalance(double balance) {
        this.balance = balance; // VIP can set any balance, even negative
    }
}