package org.andestech.learning.rfb19.g3;

import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {

//        HashMap<String, Book> hashMap = new HashMap<>();
//        hashMap.(new Book("book1","Book1", "1234"));

        HashSet<Book> hashSet = new HashSet<>();
        hashSet.add(new Book("Оно", "Стивенг Кинг", "561234"));
        hashSet.add(new Book("Метро 2033", "Глуховский Дмитрий", "51234"));
        hashSet.add(new Book("Анна Каренина", "Лев Толстой", "1234"));




    }

    private static class Book {
        String title, author, ISBN;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        public String toString() {

            return title + ", " + author + ", " + ISBN + ".";
        }
    }
}
