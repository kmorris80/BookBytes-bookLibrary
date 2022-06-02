package com.techelevator.model;

public class Kids {

    private int kidId;
    private int userId;
    private int parentId;
    private int steps;
    private int activityTime;


    public int getKidId() {
        return kidId;
    }

    public void setKidId(int kidId) {
        this.kidId = kidId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(int activityTime) {
        this.activityTime = activityTime;
    }

    @Override
    public String toString() {
        return "Kids{" +
                "kidId=" + kidId +
                ", userId=" + userId +
                ", parentId=" + parentId +
                ", steps=" + steps +
                ", activityTime=" + activityTime +
                '}';
    }
}
