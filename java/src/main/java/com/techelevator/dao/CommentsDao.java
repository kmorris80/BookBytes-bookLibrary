package com.techelevator.dao;

import com.techelevator.model.Comments;


import java.util.List;

public interface CommentsDao {

    List<Comments>getAllComments();

    Comments findCommentById (int commentId);

    Comments addComment (Comments comments);

    Comments findCommentByUserId (int userId);

}
