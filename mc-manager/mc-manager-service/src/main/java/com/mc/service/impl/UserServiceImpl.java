package com.mc.service.impl;

import com.mc.pojo.User;
import com.mc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired(required = false)
    private UserService userService;
    @Override
    public List<User> findAll(long id2) {
        List<User> result=userService.findAll(id2);
        return result;
    }
}
