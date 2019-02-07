package org.andestech.learning.rfb19.g3;


import java.util.ArrayList;
import java.util.Comparator;

enum BookSortBy {
    TITLE, AUTHOR, YEAR;

    public static void BookSort(ArrayList<Book> bookArrayList, BookSortBy bookSortBy) {
        switch (bookSortBy) {
            case YEAR:
                bookArrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o2.getYear() - o1.getYear();
                    }
                });
                break;
            case TITLE:
                bookArrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                });
            case AUTHOR:
                bookArrayList.sort(new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthor().compareTo(o2.getAuthor());
                    }
                });
        }

    }
}

