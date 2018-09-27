package com.mc.service.impl;

import com.mc.common.pojo.McResult;
import com.mc.mapper.CommunityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mc.pojo.Community;
import com.mc.service.CommunityService;
 @Service
public class  CommunityServiceImpl implements CommunityService{
     @Autowired(required = false)
     private CommunityMapper communityMapper;

     public McResult addCommunity(long account, String name, String phone, String email, String phone1, String address, String introduce) {
         Community community=new Community();
         community.setAccount(account);
         community.setName(name);
         community.setPhone(phone);
         community.setEmail(email);
         community.setPhone1(phone1);
         community.setAddress(address);
         community.setIntroduce(introduce);
         communityMapper.addCommunity(community);
         return McResult.ok();
     }


     public McResult updateCommunity(String phone, String email, String phone1, String address, String introduce) {
         Community community=new Community();
         community.setPhone(phone);
         community.setEmail(email);
         community.setPhone1(phone1);
         community.setAddress(address);
         community.setIntroduce(introduce);
         communityMapper.updateCommunity(community);
         return McResult.ok();
     }


     public Community findCommunityByName(String name) {
         Community result=communityMapper.findCommunityByName(name);
         return result;
     }


     public Community findCommunityByPhone(String phone) {
         Community result=communityMapper.findCommunityByPhone(phone);
         return result;
     }
 }
