package com.techelevator.dao;

import com.techelevator.model.Kids;

import java.util.List;

public interface KidsDao {

    List<Kids> findAll();

    Kids getKidById(int kidId);

    Kids findIdByUsername(String username);

    Kids addKid(Kids kids);


}
