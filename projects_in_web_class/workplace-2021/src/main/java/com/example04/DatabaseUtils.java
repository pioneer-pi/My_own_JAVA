package com.example04;

import java.time.LocalDateTime;

public class DatabaseUtils {
    public static User getUser(String userName,String password){
        User user = null;
        if ("pioneer".equals(userName) && "123456".equals(password)){
            user = new User("王小明", LocalDateTime.now());
        }
        return user;
    }
}
