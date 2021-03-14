package com.rex.springboot.service.impl;

import com.rex.springboot.bean.User;
import com.rex.springboot.mapper.UserMapper;
import com.rex.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
//    @Cacheable(value = "user",key = "id",unless = "#result==null")
    public List<User> queryFirstAll() {
        return userMapper.queryFirstAll();
    }

    @Override
    public List<User> querySecondAll() {
        return userMapper.querySecondAll();
    }

}
