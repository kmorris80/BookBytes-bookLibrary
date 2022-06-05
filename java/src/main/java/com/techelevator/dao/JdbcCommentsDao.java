package com.techelevator.dao;

import com.techelevator.model.Book;
import com.techelevator.model.Comments;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcCommentsDao implements CommentsDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcCommentsDao(JdbcTemplate jdbcTemplate){this.jdbcTemplate = jdbcTemplate;}


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
        String sql = "INSERT INTO comments (comment_by, comments, comment_date)" +
                "VALUES(?,?,?) RETURNING comment_id;";
        int commentId =
                jdbcTemplate.queryForObject(sql, Integer.class, comments.getCommentBy(), comments.getComments(), comments.getCommentDate());
        comments.setCommentId(commentId);
        return comments;
    }

    @Override
    public List<Comments> findAllCommentsByUserId(int userId) {
        List<Comments> commentListByUser = new ArrayList<>();
        String sql = "SELECT comments, comment_date FROM comments" +
                "JOIN user_comments ON comments.comment_by = user_comments.user_id" +
                "WHERE user_id = ?;";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, userId);
        List<Comments> comments = new ArrayList<>();
        while (results.next()) {
            comments.add(commentsObjectMapper(results));

        }
        return commentListByUser;
    }


    private Comments commentsObjectMapper(SqlRowSet results){

        Comments comments = new Comments();
        comments.setCommentId(results.getInt("comment_id"));
        comments.setCommentBy(results.getInt("comment_by"));
        comments.setComments(results.getString("author"));
        if (results.getDate("comment_date") !=null ){
            comments.setCommentDate(results.getDate("comment_date").toLocalDate());
        } return comments;
    }
}
