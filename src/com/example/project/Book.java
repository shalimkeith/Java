package com.example.project;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;
    private int copiesAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String title, String author, String ISBN, int yearPublished, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
        this.copiesAvailable = copiesAvailable;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Copies Available: " + copiesAvailable);
    }

    public void updateCopies(int newCopies) {
        this.copiesAvailable = newCopies;
        System.out.println("Updated copies available: " + copiesAvailable);
    }

    public static void main(String[] args) {
        Book storyOfKeith = new Book("Story of Keith", "Unknown Author", "1234567890", 2025, 3);
        storyOfKeith.displayBookInfo();

        Book programmingWithKeith = new Book("Computer Programming with Keith", "Keith", "9876543210", 2025, 5);
        programmingWithKeith.displayBookInfo();
    }
}

