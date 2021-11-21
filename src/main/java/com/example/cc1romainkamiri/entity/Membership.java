package com.example.cc1romainkamiri.entity;

import java.util.Date;

public class Membership {
    private int id;
    private Date beginDate, endDate;
    private boolean isActive;
    private User user;
    private double cost;

    public Membership(int id, Date beginDate, Date endDate, boolean isActive, User user, double cost) {
        this.id = id;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.isActive = isActive;
        this.user = user;
        this.cost = cost;
    }

    public static Membership of (int id, Date beginDate, Date endDate, boolean isActive, User user, double cost){
        return new Membership(id, beginDate, endDate, isActive, user, cost);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public User getUserEntity() {
        return user;
    }

    public void setUserEntity(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
