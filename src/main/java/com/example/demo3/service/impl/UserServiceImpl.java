package com.example.demo3.service.impl;

import com.example.demo3.domain.User;
import com.example.demo3.mapper.UserMapper;
import com.example.demo3.service.UserService;
import com.example.demo3.util.JSONData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    public static Map<String, User> sessionMap = new HashMap<>();
    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONData login(User user) {

        if (userMapper.login(user.getUserName(), user.getPwd())) {
            String token = UUID.randomUUID().toString();
            sessionMap.put(token, user);
            return JSONData.buildSuccess(token);
        } else {
            return JSONData.buildFail("账号或密码不正确");
        }
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
