package com.example.project;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public boolean isClassic() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - year > 20;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2000, 1500000);
        Car car2 = new Car("Honda", "Civic", 2022, 3500000);
        Car car3 = new Car("Bugatti", "Chiron", 2021, 300000000);
        Car car4 = new Car("Lamborghini", "Aventador", 2019, 80000000);
        Car car5 = new Car("Ford", "Mustang", 1995, 5000000);
        Car car6 = new Car("Mercedes", "S-Class", 2010, 20000000);

        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();
        car4.displayCarDetails();
        car5.displayCarDetails();
        car6.displayCarDetails();

        car5.applyDiscount(15);
        System.out.println("After discount on Mustang:");
        car5.displayCarDetails();

        System.out.println("Is " + car5.model + " a classic? " + car5.isClassic());
        System.out.println("Is " + car6.model + " a classic? " + car6.isClassic());
    }
}
