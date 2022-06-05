package com.techelevator.dao;


import com.techelevator.model.ReadingList;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcReadingListDao implements ReadingListDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcReadingListDao(DataSource ds) {
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public List<ReadingList> findListByUserId(int userId) {
        String sql = "SELECT * FROM reading_list" +
                "JOIN users ON reading_list.user_id = users.user_id" +
                "WHERE user_id = ?;";
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql, userId);
        List<ReadingList> readingList = new ArrayList<>();
        while (results.next()) {
            readingList.add(readingListObjectMapper(results));

        }
        return readingList;
    }


    private ReadingList readingListObjectMapper(SqlRowSet results) {

        ReadingList readingList = new ReadingList();
        readingList.setReadingId(results.getInt("reading_id"));
        readingList.setUserId(results.getInt("user_id"));
        readingList.setRead(results.getBoolean("is_read"));

        return readingList;
    }
}
