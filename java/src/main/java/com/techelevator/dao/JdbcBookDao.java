package com.techelevator.dao;

import com.techelevator.model.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcBookDao implements BookDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcBookDao(DataSource ds){this.jdbcTemplate = new JdbcTemplate(ds);}


    @Override
    public List<Book> findAllBooks() {
        String sql = "SELECT * FROM book";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);
        List<Book> books = new ArrayList<>();
        while (results.next()) {
            books.add(bookObjectMapper(results));
        }
        return books;

    }

    @Override
    public Book findBookById(int bookId) {
        String sql = "SELECT * FROM book where book_id = ?";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, bookId);

        Book books = null;
        if(results.next()) {
            books = bookObjectMapper(results);
        }
        return books;
    }

    @Override
    public Book addBook(Book book) {
        String sql = "INSERT INTO book (title, author, isbn, new_release) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql, Integer.class, book.getTitle(), book.getAuthor(), book.getIsbn(), book.isNew_release());

        return book;
    }

    @Override
    public Book findBookByIsbn(int isbn) {

        String sql = "SELECT * FROM book WHERE isbn = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, isbn);

        if(results.next()){
            return bookObjectMapper(results);
        }else {
            throw new RuntimeException("isbn" + isbn+ "not found");
        }
    }

    private Book bookObjectMapper(SqlRowSet results){

        Book book = new Book();
        book.setBookId(results.getInt("book_id"));
        book.setIsbn(results.getInt("isbn"));
        book.setTitle(results.getString("title"));
        book.setAuthor(results.getString("author"));
        book.setNew_release(results.getBoolean("new_release"));
        return book;
    }
}
