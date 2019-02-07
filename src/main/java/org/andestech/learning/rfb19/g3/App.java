package org.andestech.learning.rfb19.g3;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Эрих Мария Ремарк", "Три товарища", 2019));
        list.add(new Book("Виктор Гюго","Отверженные" , 2019));
        list.add(new Book("Джейн Остин", "Гордость и предубеждение", 2019));
        list.add(new Book("Федор Достоевский", "Униженные и оскорбленные", 2019));

        System.out.println(list);
       // Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.title.compareTo(o2.title);
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.author.compareTo(o2.author);
            }
        });
        System.out.println(list);
    }

    private static class Book {
        String author, title;
        int year;

        public Book(String author, String title, int year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String toString() {

            return title + ", " + author + ", " + year + ".";
        }
    }
}
