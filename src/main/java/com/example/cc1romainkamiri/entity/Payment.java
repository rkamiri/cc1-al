package com.example.cc1romainkamiri.entity;

public class Payment {

    private int id;
    private Membership membership;
    private boolean isPayed;
    private double amount;
    private final User user;

    public Payment(int id, boolean isPayed, double amount, User user) {
        this.id = id;
        this.isPayed = isPayed;
        this.amount = amount;
        this.user = user;
    }

    public static Payment of(int id, boolean isPayed, double amout, User user){
        return new Payment(id, isPayed, amout, user);
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
