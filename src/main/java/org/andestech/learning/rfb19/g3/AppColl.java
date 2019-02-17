package org.andestech.learning.rfb19.g3;

import java.util.*;

public class AppColl {

    public static void main(String[] args) {


        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book("Солярис","Станислав Лем",1961));
        book.add(new Book("Мы", "Евгений Замятин",1920));
        book.add(new Book("Гадкие лебеди","Братья Стругацкие",1967));
        book.add(new Book("Гиперболоид инженера Гарина","Алексей Толстой",1927));

        System.out.println("Список книг: " + book);

        System.out.println("--------Сортировка--------");
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
