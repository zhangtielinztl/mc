package com.mc.sso.service.impl;






import com.mc.common.pojo.McResult;
import com.mc.mapper.TbUserMapper;
import com.mc.sso.pojo.TbUser;
import com.mc.sso.service.UserService;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private TbUserMapper tbUserMapper;

  @Override
  public boolean checkDate(String param , int type) {
    if (type==1){
     TbUser user =tbUserMapper.getUserByAccount(param);
      if (user==null){
        return true;
      }
    }else   if (type==2){
      TbUser user = tbUserMapper.getUserByAccount(param);
      if (user==null){
        return true;
      }
    }else   if (type==3){
      TbUser user = tbUserMapper.getUserByAccount(param);
      if (user==null){
        return true;
      }
    }else{
      return false;
    }
    return false;
  }

  @Override
  public McResult UserLogin(String userName, String passWord ) {
    System.out.println(userName);
    System.out.println(passWord);
    TbUser user = tbUserMapper.UserLogin(userName, passWord);
    if (user==null){
      return McResult.build(400,"账号密码有误，请重新输入");
    }else {
      return McResult.build(200, "登陆成功");
    }
  }


  @Override
  public McResult insertUser(TbUser user) {
    if (StringUtils.isBlank(user.getUserName())) {
      return McResult.build(400,"账号不能为空");
    }
    if (StringUtils.isBlank(user.getPassWord())){
      return McResult.build(400,"密码不能为空");
    }
    if (StringUtils.isBlank(user.getPhone())){
      return McResult.build(400,"手机号不能为空");
    }
    if (StringUtils.isBlank(user.getEmail())){
      return McResult.build(400,"邮箱不能为空");
    }
    //校检数据是否可用

    if (!checkDate(user.getUserName(),1)) {
      return McResult.build(400, "此用户名已经被使用");
    }
    //校验电话是否可以
    if (StringUtils.isNotBlank(user.getPhone())) {
      if (!checkDate(user.getPhone(), 2)) {
        return McResult.build(400, "此手机号已经被使用");
      }
    }
    //校验email是否可用
    if (StringUtils.isNotBlank(user.getEmail())) {
      if (!checkDate(user.getEmail(), 3)) {
        return McResult.build(400, "此邮件地址已经被使用");
      }
    }
    System.out.print(user);
    tbUserMapper.insertUser(user);
    return McResult.build(200,"注册成功");
    }
}
