package com.example.resume.service.impl;

import com.example.resume.mapper.UserMapper;
import com.example.resume.pojo.User;
import com.example.resume.pojo.UserQuery;
import com.example.resume.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<String> getUser(String userId) {
        return userMapper.getUser(userId);
    }
}
