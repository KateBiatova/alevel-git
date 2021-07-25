package com.alevel.bookLibrary;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        String title;
//        String authors;
        SetBooks bookSet = new SetBooks();
        SetAuthors authorSet = new SetAuthors();

        Scanner input = new Scanner(System.in);
        int exit = 0;
        int todo;
        do {
            System.out.println("Enter '1' to Add book");
            System.out.println("Enter '2' to Read book");
            System.out.println("Enter '3' to Update book");
            System.out.println("Enter '4' to Delete book");
            System.out.println("Enter '5' to Add author");
            System.out.println("Enter '6' to Read author");
            System.out.println("Enter '7' to Update author");
            System.out.println("Enter '8' to Delete author");
            System.out.println("Enter '9' to Search all books by author");
            System.out.println("Enter '10' to Search all authors by books");
            System.out.println("Enter '0' to Exit");

            try {
                todo = input.nextInt();
            } catch (NumberFormatException e) {
                todo = -1;
            }
            if (todo == 1)
                bookSet.addBook();
            else if (todo == 2)
                bookSet.readBook();
            else if (todo == 3)
                bookSet.updateBook();
            else if (todo == 4)
                bookSet.deleteBook();
            else if (todo == 5)
                authorSet.addAuthor();
            else if (todo == 6)
                authorSet.readAuthor();
            else if (todo == 7)
                authorSet.updateAuthor();
            else if (todo == 8)
                authorSet.deleteAuthor();
            else if (todo == 9)
                authorSet.searchAllBooksByAuthor();
            else if (todo == 10)
                bookSet.searchAllAuthorsByBook();

        }while(todo != exit);
        System.out.println("Application will be closed");
    }
}
