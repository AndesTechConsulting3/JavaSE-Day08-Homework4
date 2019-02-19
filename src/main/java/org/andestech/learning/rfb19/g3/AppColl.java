package org.andestech.learning.rfb19.g3;

import java.util.*;

public class AppColl {

    public static void main(String[] args) {


        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("КНИГА1","МАША ИВАНОВА",754));
        book.add(new Book("КНИГА2", "САША ПЕТРОВ",1945));
        book.add(new Book("КНИГА3","ВАНЯ",2001));
        book.add(new Book("КНИГА4","ПЕТЯ",1965));


        book.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.title.compareTo(o2.title);
            }
        });
        System.out.println("Сортировка по имени: " + book);

        book.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });
        System.out.println("Сортировка по автору: " + book);

        book.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.year.compareTo(o2.year);
            }
        });
        System.out.println("Сортировка по дате выпуска: " + book);

    }

    private static class Book
    {
        String title, author;
        Integer year;

        public Book(String title, String author, Integer year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String toString(){
            return title + ", " +author + ", " + year;
        }

    }

}