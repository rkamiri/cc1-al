package com.example.cc1romainkamiri.entity;

import java.util.Objects;

public class User {

    private int id;

    private String firstname;
    private String lastname;
    private String password;
    private String email;

    public User(int id, String firstname, String lastname, String password, String email) {
        this.id = id;
        this.firstname = Objects.requireNonNull(firstname);
        this.lastname = Objects.requireNonNull(lastname);
        this.password = Objects.requireNonNull(password);
        this.email = Objects.requireNonNull(email);
    }

    public static User of(int id, String firstname, String lastname, String password, String email){
        return new User(id, firstname, lastname, password, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
