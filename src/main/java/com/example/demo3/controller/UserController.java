package com.example.demo3.controller;

import com.example.demo3.domain.User;
import com.example.demo3.service.UserService;
import com.example.demo3.util.JSONData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {


    @Autowired
    private UserService userService;
//    @PostMapping("login")
//    public JSONData login(String userName, String pwd){
//        System.out.println("userName="+userName+",pwd="+pwd);
//        return JSONData.buildSuccess();
//    }
//    @PostMapping("login")
//    public JSONData login(User user){
//        System.out.println("userName="+user.getUserName()+",pwd="+user.getPwd());
//        return JSONData.buildSuccess();
//    }
    @PostMapping("login")
    public JSONData login(@RequestBody User user){
        return userService.login(user);
    }

    @GetMapping("list")
    public JSONData list(){
        return JSONData.buildSuccess(userService.list());
    }

}
