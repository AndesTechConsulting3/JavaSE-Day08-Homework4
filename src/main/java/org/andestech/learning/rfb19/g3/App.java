package org.andestech.learning.rfb19.g3;

import java.util.*;

public class App {
    public static void main(String[] args) {

//        HashMap<String, Book> hashMap = new HashMap<>();
//        hashMap.(new Book("book1","Book1", "1234"));

        HashSet<Book> hashSet = new HashSet<>();
        hashSet.add(new Book("Оно", "Стивенг Кинг", 2000));
        hashSet.add(new Book("Метро 2033", "Глуховский Дмитрий", 1957));
        hashSet.add(new Book("Анна Каренина", "Лев Толстой", 2007));


        System.out.println(hashSet);

        // механизм сортировки по году издания







    }

    private static class Book {
        String title, author; int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String toString() {

            return title + ", " + author + ", " + year + ".";
        }
    }
}
