package com.group820.demos.entity;

public class User {
    private int userid;
    private String username;
    private String password;

    public User(){

    }
    public User(int uid, String username, String password) {
        this.userid = uid;
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return userid;
    }

    public void setUid(int uid) {
        this.userid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
