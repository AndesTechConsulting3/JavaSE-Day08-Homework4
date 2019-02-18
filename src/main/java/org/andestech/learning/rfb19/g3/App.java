package org.andestech.learning.rfb19.g3;

import java.util.ArrayList;
import java.util.Comparator;
//
//import static jdk.vm.ci.sparc.SPARC.o1;
//import static jdk.vm.ci.sparc.SPARC.o2;

public class App
{

    public static void sortBooks(ArrayList<Book> arrayList, BookSortBy bookSortBy) {

        switch (bookSortBy) {
            case YEAR:
                arrayList.sort(Comparator.comparingInt(Book::getYear));
                break;
            case TITLE:
                arrayList.sort(Comparator.comparing(Book::getTitle));
                break;
            case AUTHOR:
                arrayList.sort(Comparator.comparing(Book::getAuthor));
                break;
//            case TITLE:
//                arrayList.sort((o1, o2) -> o1.getTitle().compareToIgnoreCase(o2.getTitle()));
//                break;
//            case AUTHOR:
//                arrayList.sort((o1, o2) -> o1.getAuthor().compareToIgnoreCase(o2.getAuthor()));
//                break;
        }
    }

    public static void main( String[] args )
    {
        //-------------Books collection
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Почтампт", "Чарльз Буковски", 1978));
        books.add(new Book("Гeneration п", "Виктор Пелевин", 1999));
        books.add(new Book("Бойцовский клуб", "Чак Паланик", 1996));
        books.add(new Book("Сияние", "Стивен Кинг ", 1977));

        //--------------------Title sort
        System.out.println("Title sort:");
        sortBooks(books, BookSortBy.TITLE);
        System.out.println(books);

        //------------------Author sort
        System.out.println("Author sort:");
        sortBooks(books, BookSortBy.AUTHOR);
        System.out.println(books);

        //--------------------Without sort
        System.out.println("Without sort:");
        System.out.println(books);

        //---------------Year sort
        System.out.println("Year sort:");
        sortBooks(books, BookSortBy.YEAR);
        System.out.println(books);
    }
}
