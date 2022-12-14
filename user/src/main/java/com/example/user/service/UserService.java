package com.example.user.service;


import com.example.user.mapper.UserMapper;
import com.example.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User queryById(Long id) {
        System.out.println("调用了我的user服务");
        return userMapper.findById(id);
    }
}