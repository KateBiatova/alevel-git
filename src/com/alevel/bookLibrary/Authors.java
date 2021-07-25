package com.alevel.bookLibrary;

public class Authors {
    private String firstName;
    private String lastName;
    private String books;

    public Authors(String firstName, String lastName, String books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String title) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books='" + books + '\'' +
                '}';
    }
}
