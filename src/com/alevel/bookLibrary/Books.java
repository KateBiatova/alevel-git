package com.alevel.bookLibrary;

public class Books {
    private String title;
    private String authors;

    public Books(String title, String authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }
}
