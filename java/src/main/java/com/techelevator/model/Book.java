package com.techelevator.model;

public class Book {

    private int bookId;
    private int isbn;
    private String title;
    private String author;
    private boolean newRelease;

    public Book(){}

    public Book(int isbn, String title, String author, boolean newRelease) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.newRelease = newRelease;
    }

    public Book(int bookId, int isbn, String title, String author, boolean newRelease) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.newRelease = newRelease;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isNew_release() {
        return newRelease;
    }

    public void setNew_release(boolean new_release) {
        this.newRelease = new_release;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", new_release=" + newRelease +
                '}';
    }
}

