package com.example.project;

public class Item {
    private String name;
    private double price;
    private int quantity;

    
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

 
    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + getTotalPrice());
        System.out.println("---------------------------");
    }

    public void updateQuantity(int additionalQuantity) {
        this.quantity += additionalQuantity;
    }
}