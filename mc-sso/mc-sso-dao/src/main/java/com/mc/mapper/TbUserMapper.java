package com.mc.mapper;


import com.mc.sso.pojo.TbUser;

public interface TbUserMapper {
  /** 根据账号查询用户
      * @param userName 用户账号
      * @return User对象 User不为空 账号已经存在
      */
  TbUser getUserByAccount(String userName);

    /**
     * 根据手机号
     * @param phone
     * @return 手机号已经被使用
     */
    TbUser getUserByPhonenumber(String phone);

    /**
     * 根据邮箱
     * @param email
     * @return 邮箱已经被使用
     */
    TbUser getUserByEmail(String email);
    /**
     * 根据账号和密码查询用户
     * @param userName 账号
     * @param passWord 密码
     * @return 用户
     */
    TbUser UserLogin(String userName, String passWord);

    /**
     *注册一个用户
     * @param user 要注册的用户
     */
    void insertUser(TbUser user);
}