package com.techelevator.dao;

import com.techelevator.model.Comments;


import java.util.List;

public interface CommentsDao {

    List<Comments>getAllComments();

    Comments findCommentById (int commentId);

    Comments addComment (Comments comments);

//    List<Comments> findAllCommentsByUserId (int userId);

    List<Comments> findAllCommentsByForumId(int forumId);
}
