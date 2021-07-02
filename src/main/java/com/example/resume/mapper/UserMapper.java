package com.example.resume.mapper;


import com.example.resume.pojo.User;
import com.example.resume.pojo.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<String> getUser(String id);

    Integer addUser(User user);
}
