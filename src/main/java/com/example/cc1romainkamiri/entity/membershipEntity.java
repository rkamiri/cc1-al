package com.example.cc1romainkamiri.entity;

import java.util.Date;

public class membershipEntity {
    private int id;
    private Date beginDate, endDate;
    private boolean isPayed;
    private UserEntity userEntity;

    public membershipEntity(int id, Date beginDate, Date endDate, boolean isPayed, UserEntity userEntity) {
        this.id = id;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.isPayed = isPayed;
        this.userEntity = userEntity;
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

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
