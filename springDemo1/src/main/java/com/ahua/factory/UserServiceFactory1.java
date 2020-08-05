package com.ahua.factory;

import com.ahua.service.IUserService;
import com.ahua.service.UserServiceImpl;

public class UserServiceFactory1 {
    public static IUserService createUserService(String name) {
        if (name.equalsIgnoreCase("zhangsan")) {
            return new UserServiceImpl();
        }
        return null;
    }
}

