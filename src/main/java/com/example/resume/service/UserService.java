package com.example.resume.service;

import com.example.resume.pojo.User;
import com.example.resume.pojo.UserQuery;

import java.util.List;

public interface UserService {

    Integer addUser(User user);

    List<String> getUser(String userId);
}
