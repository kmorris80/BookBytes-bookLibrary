package com.techelevator.dao;

import com.techelevator.model.Kids;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class JdbcKidsDao implements KidsDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcKidsDao(DataSource ds) {
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    private Kids kidsObjectMapper(SqlRowSet results) {

        Kids kids = new Kids();
        Kids.setKidId(results.getInt("kid_id"));
        Kids.setUserId(results.getInt("user_id"));
        Kids.setParentId(results.getInt("parent_id"));
        Kids.setScheduledArrival(results.getTimestamp("scheduled_arrival").toLocalDateTime());
        flight.setArrivalAirport(results.getString("arrival_airport"));
        flight.setDepartureAirport(results.getString("departure_airport"));
        flight.setAircraftCode(results.getString("aircraft_code"));
        flight.setMoney(results.getBigDecimal("price"));

        return kids;
    }

    @Override
    public List<Kids> findAll() {

        return null;
    }

    @Override
    public Kids getKidById(int kidId) {
        return null;
    }

    @Override
    public Kids findIdByUsername(String username) {
        return null;
    }

    @Override
    public Kids addKid(Kids kids) {
        return null;
    }
}
