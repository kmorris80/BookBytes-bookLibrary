package com.techelevator.model;

public class Comments {

    private int commentId;
    private int userId;
    private String comment;


    public Comments(){}

    public Comments(int userId, String comment) {
        this.userId = userId;
        this.comment = comment;
    }

    public Comments(int commentId, int userId, String comment) {
        this.commentId = commentId;
        this.userId = userId;
        this.comment = comment;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setForumId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
