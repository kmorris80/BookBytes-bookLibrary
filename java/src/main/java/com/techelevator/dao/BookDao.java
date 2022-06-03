package com.techelevator.dao;

import com.techelevator.model.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookDao {

    List<Book>findAllBooks();

    Book findBookByTitle (String bookId);

    Book addBook (Book book);

    Book findBookByCharacter (String character);

    Book findBookByGenre (String genre);

    Book findBookByKeyword (String keyword);

    Book findBookByAuthor (String author);

}
