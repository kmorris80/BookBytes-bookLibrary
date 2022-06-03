package com.techelevator.dao;

import com.techelevator.model.ReadingList;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbcReadingListDao implements ReadingListDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcReadingListDao(DataSource ds){this.jdbcTemplate = new JdbcTemplate(ds);}

    @Override
    public ReadingList findListByUserId(int userId) {



        return null;
    }
}
