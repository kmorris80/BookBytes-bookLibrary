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
    public Book findBookByTitle (String title) {
        String sql = "SELECT * FROM book where title = ?";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, title);

        if(results.next()){
            return bookObjectMapper(results);
        }else {
            throw new RuntimeException("title" + title + "not found");
        }
    }

    @Override
    public Book addBook(Book book) {
        String sql = "INSERT INTO book (title, author, isbn, genre, keyword, new_release) VALUES(?,?,?,?,?,?)";
        jdbcTemplate.update(sql, Integer.class, book.getTitle(), book.getAuthor(), book.getIsbn(), book.getGenre(),book.getKeyword(), book.isNewRelease() );

        return book;
    }

    @Override
    public Book findBookByKeyword(String keyword) {

        String sql = "SELECT * FROM book WHERE keyword = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, keyword);

        if(results.next()){
            return bookObjectMapper(results);
        }else {
            throw new RuntimeException("keyword" + keyword + "not found");
        }
    }

    @Override
    public Book findBookByGenre(String genre) {

        String sql = "SELECT * FROM book WHERE genre = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, genre);

        if(results.next()){
            return bookObjectMapper(results);
        }else {
            throw new RuntimeException("genre" + genre + "not found");
        }
    }

    @Override
    public Book findBookByCharacter(String character) {

        String sql = "SELECT * FROM book WHERE character = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, character);

        if(results.next()){
            return bookObjectMapper(results);
        }else {
            throw new RuntimeException("character" + character + "not found");
        }
    }
    @Override
    public Book findBookByAuthor(String author) {

        String sql = "SELECT * FROM book WHERE author = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, author);

        if(results.next()){
            return bookObjectMapper(results);
        }else {
            throw new RuntimeException("author" + author + "not found");
        }
    }

    private Book bookObjectMapper(SqlRowSet results){

        Book book = new Book();
        book.setBookId(results.getInt("book_id"));
        book.setTitle(results.getString("title"));
        book.setAuthor(results.getString("author"));
        book.setIsbn(results.getInt("isbn"));
        book.setCharacter(results.getString("character"));
        book.setGenre(results.getString("genre"));
        book.setKeyword(results.getString("keyword"));
        book.setNewRelease(results.getBoolean("new_release"));
        return book;
    }
}
