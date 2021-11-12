package com.example.demo3.mapper;

import com.example.demo3.domain.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserMapper {

    private static Map<String, User> map = new HashMap<>();

    static {
        map.put("user1", new User(1,"user1","123"));
        map.put("user2", new User(2,"user2","456"));
        map.put("user3", new User(3,"user3","789"));
    }

    public boolean login(String userName, String pwd){
        if (map.containsKey(userName)){
            User user = map.get(userName);
            if (user.getPwd().equals(pwd)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public List<User> list(){
        List<User> userList = new ArrayList<>();
        userList.addAll(map.values());
        return userList;
    }
}
