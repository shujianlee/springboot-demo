package com.example.demo3.domain;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String userName;
//    @JsonIgnore
    private String pwd;

    public User(){}

    public User(int id, String userName, String pwd) {
        this.id = id;
        this.userName = userName;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
