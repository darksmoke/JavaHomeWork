package com.pb.sydorin.hw5;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int yearsPublishing;

    public Book(String bookTitle, String bookAuthor, int yearsPublishing) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearsPublishing = yearsPublishing;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getYearsPublishing() {
        return yearsPublishing;
    }

    public void setYearsPublishing(int yearsPublishing) {
        this.yearsPublishing = yearsPublishing;
    }

    String getBookInfo() {
        return "Название: " + bookTitle + ", Автор: " + bookAuthor + ", Год издания: " + yearsPublishing;
    }
}
