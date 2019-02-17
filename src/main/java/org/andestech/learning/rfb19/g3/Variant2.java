package org.andestech.learning.rfb19.g3;

import java.util.*;

public class Variant2 {

    public enum BookSortBy {
        TITLE, AUTHOR, YEAR
    }

    public static void sortBooks(ArrayList<Book> arrayList, BookSortBy bookSortBy) {

        switch (bookSortBy) {
            case YEAR:
                arrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getYear() - o2.getYear();
                    }
                });
                break;
            case TITLE:
                arrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
                    }
                });
                break;
            case AUTHOR:
                arrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
                    }
                });
                break;
        }
    }

    private static class Book
    {
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public Integer getYear() {
            return year;
        }

        String title, author;
        Integer year;

        public Book(String author, String title, int year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String toString(){
            return title + ", " + author + ", " + year + ".\n";
        }

    }

    public static void main( String[] args )
    {
        //Создаем коллекцию книг
        ArrayList<Book> booklist = new ArrayList<>();

        booklist.add(new Book("Николай Носов", "Незнайка учится", 1937));
        booklist.add(new Book("Джанни Родари","Чиполлино" , 1961));
        booklist.add(new Book("Джордж Оруэлл", "1.9.8.4.", 1949));
        booklist.add(new Book("Рэй Брэдбери", "Марсианские хроники", 1950));

        //Сначала выведем книги без сортировки
        System.out.println("Книги без сортировки:");
        System.out.println(booklist);

        //Сортируем книги по названию
        System.out.println("Сортируем книги по названию:");
        sortBooks(booklist, BookSortBy.TITLE);
        System.out.println(booklist);

        //Сортируем книги по автору
        System.out.println("Сортируем книги по автору:");
        sortBooks(booklist, BookSortBy.AUTHOR);
        System.out.println(booklist);

        //Сортируем книги по году
        System.out.println("Сортируем книги по году:");
        sortBooks(booklist, BookSortBy.YEAR);
        System.out.println(booklist);
    }
}
