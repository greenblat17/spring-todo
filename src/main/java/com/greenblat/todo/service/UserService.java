package com.greenblat.todo.service;

import com.greenblat.todo.dao.UserRepository;
import com.greenblat.todo.entity.UserEntity;
import com.greenblat.todo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User addUser(UserEntity user) {
        UserEntity userEntity = userRepository.save(user);
        return new User().userEntityToModel(userEntity);
    }

    public int deleteUser(int id) {
        userRepository.deleteById(id);
        return id;
    }
}
