package com.alevel.bookLibrary;



import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class SetBooks {
    Set<Books> books = new HashSet<>();

    public void addBook() throws FileNotFoundException {
        String title;
        String authors;
        Scanner input = new Scanner(System.in);
        PrintWriter outputfile = new PrintWriter(FileBook.FILE_PATH.getPath());

        System.out.println("Enter book title: ");
        title = input.nextLine();
        System.out.println("Enter authors (separate with coma): ");
        authors = input.nextLine();

        books.add(new Books(title, authors));

        books.forEach(outputfile::println);
        outputfile.close();
    }

    public void readBook(){
        String title;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter book title you want to read: ");
        title = input.nextLine();

        for (Books book: books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
                break;
            }else System.out.println("Book was not found");
        }
    }

    public void updateBook(){
        String title;
        String newTitle;
        String newAuthors;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter book title you want to update: ");
        title = input.nextLine();
        System.out.println("Enter new book title: ");
        newTitle = input.nextLine();
        System.out.println("Enter new authors (separate with coma): ");
        newAuthors = input.nextLine();

        for (Books book: books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                break;
            }else System.out.println("Book was not found");
        }

        books.add(new Books(newTitle, newAuthors));
        System.out.println("Book " + title + " was updated" );
    }

    public void deleteBook(){
        String title;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter book title you want to delete: ");
        title = input.nextLine();

        Iterator<Books> i = books.iterator();

        for (Books book: books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("Book " + title + " was deleted");
                break;
            }else System.out.println("Book was not found");
        }
    }

    public void searchAllAuthorsByBook(){
        String title;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter book title you want to read: ");
        title = input.nextLine();

        for (Books book: books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book.getAuthors());
                break;
            }else System.out.println("Book was not found");
        }
    }
}
