package com.example.demo3.service;

import com.example.demo3.domain.User;
import com.example.demo3.util.JSONData;

import java.util.List;

public interface UserService {

    JSONData login(User user);

    List<User> list();
}

