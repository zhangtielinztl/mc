package com.mc.sso.controller;


import com.mc.common.pojo.McResult;
import com.mc.sso.pojo.TbUser;
import com.mc.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class UserController {
    @Autowired
    private UserService userService;
    private McResult mcResult;
    @RequestMapping("/")
    public String showLogin(){
        return "login";
    }
    @RequestMapping(value="/User/login", method= RequestMethod.POST)
    public String UserLogin( TbUser  user){
        System.out.print(user);
        McResult medicalResult = userService.UserLogin(user.getUserName(),user.getPassWord());
        if (medicalResult.getStatus()==200){
            return "loginok";
        }else if (medicalResult.getStatus()==400){
            return "login";
        }
        return null;
    }
    @RequestMapping("/page/register")
    public String showRegister(){
        return "Register";
    }
    //用户注册
    @RequestMapping(value = "/User/Register",method= RequestMethod.POST)
    public String UserRegister(TbUser user){
        mcResult  = userService.insertUser(user);
        if (mcResult.getStatus()==200){
            return "login";
        }else if (mcResult.getStatus()==400){
            return mcResult.getMsg();
        }
        return null;
    }


    }
