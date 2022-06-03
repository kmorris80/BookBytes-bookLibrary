package com.techelevator.dao;

import com.techelevator.model.Book;
import com.techelevator.model.Comments;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcCommentsDao implements CommentsDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcCommentsDao(DataSource ds){this.jdbcTemplate = new JdbcTemplate(ds);}


    @Override
    public List<Comments> getAllComments() {
        String sql = "SELECT * FROM comments";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);
        List<Comments> comments = new ArrayList<>();
        while (results.next()) {
            comments.add(commentsObjectMapper(results));
        }
        return comments;

    }


    @Override
    public Comments findCommentById(int commentId) {
        return null;
    }

    @Override
    public Comments addComment(Comments comments) {
        return null;
    }

    @Override
    public Comments findAllCommentsByUserId(int userId) {
        return null;
    }

    @Override
    public Comments findCommentByUserId(int userId) {
        return null;
    }
    private Comments commentsObjectMapper(SqlRowSet results){

        Comments comments = new Comments();
        comments.setCommentId(results.getInt("comment_id"));
        comments.setCommentBy(results.getInt("comment_by"));
        comments.setComments(results.getString("author"));
        comments.setCommentDate(results.getDate("comment_date"));
        return comments;
    }
}
