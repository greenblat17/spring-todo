package com.greenblat.todo.dao;

import com.greenblat.todo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,  Integer> {
}
