package com.ahua.factory;

import com.ahua.service.IUserService;
import com.ahua.service.UserServiceImpl;

public class UserServiceFactory2 {
    public IUserService createUserService() {
        return new UserServiceImpl();
    }
}
