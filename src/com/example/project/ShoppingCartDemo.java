package com.example.project;


public class ShoppingCartDemo {
    public static void main(String[] args) {
      
        Item item1 = new Item("Laptop", 80000.0, 1);
        Item item2 = new Item("Headphones", 5000.0, 2);

        item1.displayItemDetails();
        item2.displayItemDetails();

        item2.updateQuantity(1); // Adding one more headphone
        System.out.println("After updating quantity:");
        item2.displayItemDetails();
    }
}

