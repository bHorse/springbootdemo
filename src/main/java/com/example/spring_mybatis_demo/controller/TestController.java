package com.example.spring_mybatis_demo.controller;

import com.example.spring_mybatis_demo.dao.UserDao;
import com.example.spring_mybatis_demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tby on 2017/6/14.
 */
@RestController
public class TestController {
    @Autowired
    private UserDao userDao;
    @RequestMapping(value = "user/{id}",method = RequestMethod.GET,produces = "application/json")
    public User findUser(@PathVariable Integer id){
        return userDao.findById(id);
    }
}
