package Homework3P2;

import java.util.*;

public class Book {
    final String BookTitle, BookAuthor, BookGenre, BookDescription, BookURL;
    public Book(String bTitle, String bAuthor, String bGenre, String bDescription, String bURL) {
        BookTitle = bTitle;
        BookAuthor = bAuthor;
        BookGenre = bGenre;
        BookDescription = bDescription;
        BookURL = bURL;
    }

    static void PublishBook(ArrayList<Student> s, ArrayList<Teacher> t, ArrayList<Book> b, ArrayList<Research> r,ArrayList<int[]> record) {
        Main goBack = new Main(t,s,b,r,record);
        Scanner rInformation = new Scanner(System.in);
        System.out.print("Input Book Title: ");
        String bTitle = rInformation.nextLine();
        System.out.print("Input Book Author: ");
        String bAuthor = rInformation.nextLine();
        System.out.print("Input Book Genre: ");
        String bGenre = rInformation.nextLine();
        System.out.print("Input Book Description: ");
        String bDescription = rInformation.nextLine();
        System.out.print("Input Book URL: ");
        String bURL = rInformation.next();
        Book add = new Book(bTitle,bAuthor,bGenre,bDescription,bURL);
        b.add(add);
        System.out.println("Book Added");
        goBack.task(1);
    }
    
}
