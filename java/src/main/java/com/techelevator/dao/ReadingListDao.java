package com.techelevator.dao;

import com.techelevator.model.Comments;
import com.techelevator.model.ReadingList;

import java.util.List;

public interface ReadingListDao {


    ReadingList findListByUserId (int userId);

}

