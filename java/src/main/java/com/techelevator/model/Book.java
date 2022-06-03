package com.techelevator.model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private int isbn;
    private String character;
    private String genre;
    private String keyword;
    private boolean newRelease;

    public Book(){}

    public Book(String title, String author, int isbn,  String character, String genre, String keyword, boolean newRelease) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.keyword = keyword;
        this.character = character;
        this.newRelease = newRelease;
    }

    public Book(int bookId, String title, String author, int isbn, String character, String genre, String keyword, boolean newRelease) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.keyword = keyword;
        this.character = character;
        this.newRelease = newRelease;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public boolean isNewRelease() {
        return newRelease;
    }

    public void setNewRelease(boolean newRelease) {
        this.newRelease = newRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", character='" + character + '\'' +
                ", genre='" + genre + '\'' +
                ", keyword='" + keyword + '\'' +
                ", newRelease=" + newRelease +
                '}';
    }
}

