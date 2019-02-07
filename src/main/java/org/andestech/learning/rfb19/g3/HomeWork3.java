package org.andestech.learning.rfb19.g3;


import java.util.ArrayList;

import static org.andestech.learning.rfb19.g3.BookSortBy.BookSort;

public class HomeWork3 {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList();
        books.add(new Book(1989, "Tratata", "Сказки"));
        books.add(new Book(2011, "Andrey", "Повести"));
        books.add(new Book(1765, "Old author", "Роман"));
        books.add(new Book(2005, "Big Boss", "Сборник анекдотов"));

        BookSort(books, BookSortBy.YEAR);
        System.out.println(books);

        BookSort(books, BookSortBy.AUTHOR);
        System.out.println(books);

        BookSort(books, BookSortBy.TITLE);
        System.out.println(books);


    }
}
