package org.andestech.learning.rfb19.g3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Гарри Поттер и Философский Камень", "Дж.К.Роулинг", 1998));
        books.add(new Book("Гарри Поттер и Орден Феникса", "Дж.К.Роулинг", 2005));
        books.add(new Book("Гарри Поттер и Дары Смерти", "Дж.К.Роулинг", 2009));
//сортируем по названию
        sortBooks(books, BookSortBy.TITLE);
        for (Book book: books) {
            System.out.println(book.getBookInfo());
        }
//сортируем по автору
        sortBooks(books, BookSortBy.AUTHOR);
        for (Book book: books) {
            System.out.println(book.getBookInfo());
        }
//сортируем по году
        sortBooks(books, BookSortBy.YEAR);
        for (Book book: books) {
            System.out.println(book.getBookInfo());
        }
    }

    public static void sortBooks(ArrayList<Book> bookArrayList, BookSortBy bookSortBy) {
        switch (bookSortBy) {
            case YEAR:
                bookArrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book book1, Book book2) {
                        return book2.getYear() - book1.getYear();
                    }
                });
                break;
            case TITLE:
                bookArrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book book1, Book book2) {
                        return book1.getTitle().compareTo(book2.getTitle());
                    }
                });
            case AUTHOR:
                bookArrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book book1, Book book2) {
                        return book1.getAuthor().compareTo(book2.getAuthor());
                    }
                });
        }


    }



}
