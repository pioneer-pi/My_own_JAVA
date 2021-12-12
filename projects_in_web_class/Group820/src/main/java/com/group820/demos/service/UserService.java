package com.group820.demos.service;


import com.group820.demos.entity.User;

public interface UserService {
    /*
    根据Uid查询User
     */
    public User listUserByUid(int uid);

    /*
    添加新用户
     */
    public int addUser(String userid,String username,String password);

    /*
    更改用户信息
     */
    public int updateUser(String username,String password);
}
