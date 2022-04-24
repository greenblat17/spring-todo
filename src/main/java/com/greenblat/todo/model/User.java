package com.greenblat.todo.model;

import com.greenblat.todo.entity.UserEntity;

public class User {
    private String name;

    public User() {
    }

    public User userEntityToModel(UserEntity userEntity) {
        User user = new User();
        user.setName(userEntity.getName());
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
