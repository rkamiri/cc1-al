package com.example.cc1romainkamiri.service;

import com.example.cc1romainkamiri.tmp.Generator;
import com.example.cc1romainkamiri.entity.User;
import com.example.cc1romainkamiri.repository.UserRepository;

import java.util.Optional;

public class UserService {

    UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        //todo
        userRepository.addUser(user);
    }

    //todo
    public User getUser(int id) {
        // todo
        Optional<User> userOptional = userRepository.findById(id);
        //return userOptional.orElse(null);
        return Generator.generateUser();
    }

    public void removeUser(User user) {
        userRepository.deleteUser(user);
    }

    public void editUser(User user){
        //todo get a user and replace previous user by new one (using it's id)
        userRepository.saveUser(user);
    }

}
