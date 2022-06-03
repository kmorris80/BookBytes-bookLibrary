package com.techelevator.model;

public class ReadingList {

    private int readingId;
    private int userId;
    private boolean isRead;


    public ReadingList() {}

    public ReadingList(int userId, boolean isRead) {
        this.userId = userId;
        this.isRead = isRead;
    }

    public ReadingList(int readingId, int userId, boolean isRead) {
        this.readingId = readingId;
        this.userId = userId;
        this.isRead = isRead;
    }

    public int getReadingId() {
        return readingId;
    }

    public void setReadingId(int readingId) {
        this.readingId = readingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    @Override
    public String toString() {
        return "ReadingList{" +
                "readingId=" + readingId +
                ", userId=" + userId +
                ", isRead=" + isRead +
                '}';
    }
}
