package com.example.user.service;


import com.example.user.mapper.UserMapper;
import com.example.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Value("${lidain}")
    String ld;
    @Value("${a.b}")
    String ld2;
    public User queryById(Long id) {
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println("调用了我的user服务");
        return userMapper.findById(id);
    }
}