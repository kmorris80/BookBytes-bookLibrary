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

    @RequestMapping(path="/book/{title}", method = RequestMethod.GET)
    public Book bookTitle(@PathVariable String title) {
        // System.out.println("DEBUG, what the object looks like: ");
        return bookDao.findBookByTitle(title);
    }

    @RequestMapping(path="/myBooks/character", method = RequestMethod.GET)
    public Book myBooksByCharacter(@PathVariable String character) {
        // System.out.println("DEBUG, what the object looks like: ");
        return bookDao.findBookByCharacter(character);

    }

    @RequestMapping(path="/myBooks/genre", method = RequestMethod.GET)
    public Book myBooksByGenre(@PathVariable String genre) {
        // System.out.println("DEBUG, what the object looks like: ");
        return bookDao.findBookByGenre(genre);

    }
    @RequestMapping(path="/myBooks/keyword", method = RequestMethod.GET)
    public Book myBooksByKeyword(@PathVariable String keyword) {
        // System.out.println("DEBUG, what the object looks like: ");
        return bookDao.findBookByKeyword(keyword);

    }
    @RequestMapping(path="/myBooks/author", method = RequestMethod.GET)
    public Book myBooksByAuthor(@PathVariable String author) {
        // System.out.println("DEBUG, what the object looks like: ");
        return bookDao.findBookByAuthor(author);

    }


}