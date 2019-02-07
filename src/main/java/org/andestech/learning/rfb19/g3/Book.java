package org.andestech.learning.rfb19.g3;


public class Book {

    public int year;
    public String Author, Title;

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }

    public Book(int year, String author, String title) {
        this.year = year;
        this.Author = author;
        this.Title = title;
    }

    public String toString() {
        return
                "Author: " + Author + ", Title: " + Title + " ,Year: " + year;
    }


}
