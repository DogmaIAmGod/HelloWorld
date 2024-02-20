package Homework3P2;

import java.util.ArrayList;

public class BookSearch {
final String SearchString;
public BookSearch(String sString) {
    SearchString = sString;
}

    public boolean SearchBTitle(ArrayList<Book> a, BookSearch BookSearch) {
        for (Book book : a) {
            if (book.BookTitle.equalsIgnoreCase(BookSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }

    public boolean SearchBAuthor(ArrayList<Book> a, BookSearch BookSearch) {
        for (Book book : a) {
            if (book.BookAuthor.equalsIgnoreCase(BookSearch.SearchString)) {
                return true;
            }
        }
        return false;
    }
}
