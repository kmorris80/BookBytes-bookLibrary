package com.techelevator.dao;

import com.techelevator.model.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookDao {

    List<Book>findAllBooks();

    Book findBookById (int bookId);

    Book addBook (Book book);

    Book findBookByIsbn (int isbn);

}
