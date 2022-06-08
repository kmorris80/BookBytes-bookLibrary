package com.techelevator.dao;

import com.techelevator.model.Forum;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcForumDao implements ForumDao {

    private JdbcTemplate jdbcTemplate;


    public JdbcForumDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Forum> findAllForums() {
        String sql = "SELECT * FROM forum";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);
        List<Forum> forums = new ArrayList<>();
        while (results.next()) {
            forums.add(forumObjectMapper(results));
        }
        return forums;

    }


    @Override
    public Forum findForumByTopic(String topic) {
        String sql = "SELECT * FROM forum WHERE forum_topic = ?;";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, topic);

        Forum forum = null;

        if (results.next()) {
            forum = forumObjectMapper(results);
        } else {
            throw new RuntimeException("topic " + " " + topic + " " + " not found");
        }
        return forum;
    }

    @Override
    public Forum addForum(Forum forum) {
            String sql = "INSERT INTO forum (forum_topic) " +
                    "VALUES(?) RETURNING forum_id;";
            int forumId =
                    jdbcTemplate.queryForObject(sql, Integer.class, forum.getForumTopic());
            forum.setForumId(forumId);

        return forum;
    }


    private Forum forumObjectMapper(SqlRowSet results) {

        Forum forum = new Forum();
        forum.setForumId(results.getInt("forum_id"));
//        forum.setUserId(results.getInt("user_id"));
        forum.setForumTopic(results.getString("forum_topic"));
//        forum.setForumDate(LocalDate.parse(results.getString("forum_date")));

        return forum;
    }
}