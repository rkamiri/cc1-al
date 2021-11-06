package com.example.cc1romainkamiri.controller;


import com.example.cc1romainkamiri.entity.UserEntity;
import com.example.cc1romainkamiri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;
    private final MediaType contentType = MediaType.valueOf("application/json");

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable(value = "id")final int userId) {
        UserEntity commentsByUser = new UserEntity(userId, "aa","bb");
        return ResponseEntity.status(200).contentType(contentType).body(commentsByUser);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Integer> saveUser(){
        return ResponseEntity.status(200).contentType(contentType).body(1);
    }
}
