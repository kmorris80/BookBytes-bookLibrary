package com.techelevator.controller;

import com.techelevator.dao.BookDao;
import com.techelevator.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class AppController {

    @Autowired
    BookDao bookDao;


    @RequestMapping(path = "/addBook", method = RequestMethod.POST)
    public Book addNewBook(@RequestBody Book book) {
        //System.out.println("DEBUG, what the object looks like:");
        return bookDao.addBook(book);
    }
    @RequestMapping(path="/allBooks", method = RequestMethod.GET)
    public List<Book> getBooks() {
        return bookDao.findAllBooks();
    }

    @RequestMapping(path="/book/{id}", method = RequestMethod.GET)
    public Book bookById(@PathVariable int bookId) {
        // System.out.println("DEBUG, what the object looks like: ");
        return bookDao.findBookById(bookId);
    }

    @RequestMapping(path="/myBooks/{id}", method = RequestMethod.GET)
    public Book myBooksById(@PathVariable int userId) {
        // System.out.println("DEBUG, what the object looks like: ");
        return bookDao.findBookById(userId);

    }

}