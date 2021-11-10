package com.example04;

import java.time.LocalDateTime;

public class User {
    private String name;
    private LocalDateTime loginTime;
    public User(String name,LocalDateTime loginTime){
        this.name = name;
        this.loginTime = loginTime;
    }
}
