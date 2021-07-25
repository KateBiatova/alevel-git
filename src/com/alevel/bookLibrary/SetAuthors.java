package com.alevel.bookLibrary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetAuthors {
    Set<Authors> authors = new HashSet<>();

    public void addAuthor() throws FileNotFoundException {
        String firstName;
        String lastName;
        String books;
        Scanner input = new Scanner(System.in);
        PrintWriter outputfile = new PrintWriter(FileBook.FILE_PATH.getPath());

        System.out.println("Enter author first name: ");
        firstName = input.nextLine();
        System.out.println("Enter author last name: ");
        lastName = input.nextLine();
        System.out.println("Enter books (separate with coma): ");
        books = input.nextLine();

        authors.add(new Authors(firstName, lastName, books));

        authors.forEach(outputfile::println);
        outputfile.close();
    }

    public void readAuthor(){
        String lastName;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter author last name you want to read: ");
        lastName = input.nextLine();

        for (Authors author: authors) {
            if (author.getLastName().equals(lastName)) {
                System.out.println(author);
                break;
            }else System.out.println("Author was not found");
        }
    }

    public void updateAuthor(){
        String lastName;
        String newLastName;
        String newFirstName;
        String newBooks;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter author last name you want to update: ");
        lastName = input.nextLine();
        System.out.println("Enter new author last name: ");
        newLastName = input.nextLine();
        System.out.println("Enter new author first name: ");
        newFirstName = input.nextLine();
        System.out.println("Enter new author's books (separate with coma): ");
        newBooks = input.nextLine();

        for (Authors author: authors) {
            if (author.getLastName().equals(lastName)) {
                authors.remove(author);
                break;
            }else System.out.println("Author was not found");
        }

        authors.add(new Authors(newFirstName, newLastName, newBooks));
        System.out.println("Author " + lastName + " was updated" );
    }

    public void deleteAuthor(){
        String lastName;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter author last name you want to delete: ");
        lastName = input.nextLine();

        Iterator<Authors> i = authors.iterator();

        for (Authors author: authors) {
            if (author.getLastName().equals(lastName)) {
                authors.remove(author);
                System.out.println("Author " + lastName + " was deleted");
                break;
            }else System.out.println("Author was not found");
        }
    }

    public void searchAllBooksByAuthor(){
        String lastName;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter author last name you want to read: ");
        lastName = input.nextLine();

        for (Authors author: authors) {
            if (author.getLastName().equals(lastName)) {
                System.out.println(author.getBooks());
                break;
            }else System.out.println("Author was not found");
        }
    }
}
