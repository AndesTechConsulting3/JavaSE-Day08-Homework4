package org.andestech.learning.rfb19.g3;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Book> booklist = new ArrayList<>();
        booklist.add(new Book("Николай Носов", "Незнайка учится", 1937));
        booklist.add(new Book("Джанни Родари","Чиполлино" , 1961));
        booklist.add(new Book("Джордж Оруэлл", "1.9.8.4.", 1949));
        booklist.add(new Book("Рэй Брэдбери", "Марсианские хроники", 1950));

        System.out.println(booklist);

        booklist.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.title.compareTo(o2.title);
            }
        });
        System.out.println(booklist);

        booklist.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });
        System.out.println(booklist);

        booklist.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.year.compareTo(o2.year);
            }
        });
        System.out.println(booklist);

    }

    private static class Book
    {
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
}
