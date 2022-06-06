package com.techelevator.model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private String character;
    private String genre;
    private String keyword;
    private boolean newRelease;
    private boolean isRead;
    private boolean isAdded;

    public Book(){}

    public Book(String title, String author, String isbn, String character, String genre, String keyword, boolean newRelease, boolean isRead, boolean isAdded) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.character = character;
        this.genre = genre;
        this.keyword = keyword;
        this.newRelease = newRelease;
        this.isRead = isRead;
        this.isAdded = isAdded;
    }

    public Book(int bookId, String title, String author, String isbn, String character, String genre, String keyword, boolean newRelease, boolean isRead, boolean isAdded) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.character = character;
        this.genre = genre;
        this.keyword = keyword;
        this.newRelease = newRelease;
        this.isRead = isRead;
        this.isAdded = isAdded;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
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

    public boolean isNewRelease() {
        return newRelease;
    }

    public void setNewRelease(boolean newRelease) {
        this.newRelease = newRelease;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean isAdded() {
        return isAdded;
    }

    public void setAdded(boolean added) {
        isAdded = added;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", character='" + character + '\'' +
                ", genre='" + genre + '\'' +
                ", keyword='" + keyword + '\'' +
                ", newRelease=" + newRelease +
                ", isRead=" + isRead +
                ", isAdded=" + isAdded +
                '}';
    }
}

