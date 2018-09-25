package com.mc.sso.service;


import com.mc.common.pojo.McResult;
import com.mc.sso.pojo.TbUser;


public interface UserService {
    /**
     * 校检数据
     * @return
     */
    boolean checkDate(String param , int type);
    /**
     * 用户登陆
     * @param userName 用户账号
     * @param passWord 用户密码
     * @return 返回status ：200登陆成功  msg：登陆成功  400 登陆失败
     */
    McResult UserLogin(String userName, String passWord);

    /**
     * 注册一个用户
     * @param user 要注册的用户
     * @return
     */
    McResult insertUser(TbUser user);


}
