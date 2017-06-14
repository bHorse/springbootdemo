package com.example.spring_mybatis_demo.dao;

import com.example.spring_mybatis_demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by tby on 2017/6/14.
 */
public interface UserDao {
    User findById(int id);
}
