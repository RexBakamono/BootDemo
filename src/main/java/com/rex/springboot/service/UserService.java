package com.rex.springboot.service;

import com.rex.springboot.bean.User;

import java.util.List;

public interface UserService {
    List<User> queryFirstAll();
    List<User> querySecondAll();

    int deleteById(int id);

    int insertUser(User user);
}
