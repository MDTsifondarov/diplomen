package com.example.test.models;

public class Books {
    private String Id;
    private String Title;
    private String Author;
    private int YearPublished;
    private String Category;
    private String ISBN;
    private String Publisher;

    public Books(String id, String title, String author, int yearPublished, String category, String ISBN, String publisher) {
        Id = id;
        Title = title;
        Author = author;
        YearPublished = yearPublished;
        Category = category;
        this.ISBN = ISBN;
        Publisher = publisher;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYearPublished() {
        return YearPublished;
    }

    public void setYearPublished(int yearPublished) {
        YearPublished = yearPublished;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
}
