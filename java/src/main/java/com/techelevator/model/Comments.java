package com.techelevator.model;

import org.springframework.cglib.core.Local;

import java.sql.Date;
import java.time.LocalDate;

public class Comments {

    private int commentId;
    private int forumId;
    private int commentBy;
    private String comments;
    private LocalDate commentDate;

    public Comments() {}

    public Comments(int forumId, int commentBy, String comments, LocalDate commentDate) {
        this.forumId = forumId;
        this.commentBy = commentBy;
        this.comments = comments;
        this.commentDate = commentDate;
    }

    public Comments(int commentId, int forumId, int commentBy, String comments, LocalDate commentDate) {
        this.commentId = commentId;
        this.forumId = forumId;
        this.commentBy = commentBy;
        this.comments = comments;
        this.commentDate = commentDate;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getForumId() {
        return forumId;
    }

    public void setForumId(int forumId) {
        this.forumId = forumId;
    }

    public int getCommentBy() {
        return commentBy;
    }

    public void setCommentBy(int commentBy) {
        this.commentBy = commentBy;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentId=" + commentId +
                ", forumId=" + forumId +
                ", commentBy=" + commentBy +
                ", comments='" + comments + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}
