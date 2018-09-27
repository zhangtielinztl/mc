package com.mc.service;

import com.mc.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 根据id2来显示所有账号信息
     * @param id2 用户类目
     * @return 所有用户账号信息
     */
    List<User> findAll(long id2);
}
