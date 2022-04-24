package com.greenblat.todo.controller;

import com.greenblat.todo.entity.UserEntity;
import com.greenblat.todo.model.User;
import com.greenblat.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User registrationUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }

    @DeleteMapping
    public int deleteUser(int id) {
        return userService.deleteUser(id);
    }

}
