package com.rex.springboot.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.rex.springboot.bean.User;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @DS("db1")
    List<User> queryFirstAll();

    @DS("db2")
    List<User> querySecondAll();

    @DS("db1")
    int deleteById(int id);

    @DS("db1")
    int insertUser(User user);
}