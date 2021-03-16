package com.rex.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.rex.springboot.bean.User;
import com.rex.springboot.service.UserService;
import com.rex.springboot.utils.MD5Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryFirstAll")
    public String queryFirstAll(){
        return userService.queryFirstAll().toString();
    }

    @RequestMapping("/querySecondAll")
    public String querySecondAll(){
        return userService.querySecondAll().toString();
    }


    @RequestMapping("/deleteById")
    public int deleteById(int id){
        return userService.deleteById(id);
    }

    @RequestMapping("/insertUser")
    public int insertUser(String name, String pass){
        User user = new User();
        user.setName(name);
        user.setPass(pass);
        userService.insertUser(user);
        return user.getId();
    }

}
