package org.andestech.learning.rfb19.g3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{

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

    public static void main( String[] args )
    {
        //Создаем коллекцию книг
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Таинственный остров", "Джек Лондон", 1980));
        books.add(new Book("Война и мир", "Лев Толстой", 2000));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1999));
        books.add(new Book("Самоучитель по Java", "Большой Джо", 2008));

        //Сначала выведем книги без сортировки
        System.out.println("Книги без сортировки:");
        System.out.println(books);

        //Сортируем книги по названию
        System.out.println("Сортируем книги по названию:");
        sortBooks(books, BookSortBy.TITLE);
        System.out.println(books);

        //Сортируем книги по автору
        System.out.println("Сортируем книги по автору:");
        sortBooks(books, BookSortBy.AUTHOR);
        System.out.println(books);

        //Сортируем книги по году
        System.out.println("Сортируем книги по году:");
        sortBooks(books, BookSortBy.YEAR);
        System.out.println(books);
    }
}
