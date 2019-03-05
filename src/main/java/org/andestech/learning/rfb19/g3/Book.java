package org.andestech.learning.rfb19.g3;

public class Book {

    private String title, author;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getBookInfo() {
        String bookInfo = "Book info:\n" +
                "Title: «" + title + "»\n" +
                "Author: «" + author + "»\n" +
                "Year: «" + year + "»";
        return bookInfo;
    }

}
