package com.techelevator.model;

import org.springframework.cglib.core.Local;

import java.sql.Date;
import java.time.LocalDate;

public class Comments {

    private int commentId;
    private int commentBy;
    private String comments;
    private Date commentDate;

    public Comments() {
    }

    public Comments(int commentBy, String comments, Date commentDate) {
        this.commentBy = commentBy;
        this.comments = comments;
        this.commentDate = commentDate;
    }

    public Comments(int commentId, int commentBy, String comments, Date commentDate) {
        this.commentId = commentId;
        this.commentBy = commentBy;
        this.comments = comments;
        this.commentDate = commentDate;
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

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;

    }

    @Override
    public String toString() {
        return "Comments{" +
                "commentId=" + commentId +
                ", commentBy=" + commentBy +
                ", comments='" + comments + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}
