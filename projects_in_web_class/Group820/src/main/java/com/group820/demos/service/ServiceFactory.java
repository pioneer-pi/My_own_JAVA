package com.group820.demos.service;

import com.group820.demos.entity.User;
import com.group820.demos.service.impl.GoodsServiceImpl;
import com.group820.demos.service.impl.UserServiceImpl;

public class ServiceFactory {
    private static final GoodsService goodsService = createGS();
    private static final UserService userService = createUS();

    /*
    创建获取GoodsService
     */
    private static GoodsService createGS() {
        return new GoodsServiceImpl();
    }
    public static GoodsService getGoodsService(){
        return goodsService;
    }

    /*
    创建获取UserService
     */
    private static UserService createUS(){
        return new UserServiceImpl();
    }

    public static UserService getUserService(){
        return userService;
    }
}
