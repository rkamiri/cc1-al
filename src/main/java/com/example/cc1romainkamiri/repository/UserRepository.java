package com.example.cc1romainkamiri.repository;

import com.example.cc1romainkamiri.entity.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(int userId);
    void addUser(User user);
    void deleteUser(User user);
    void saveUser(User user);
}
