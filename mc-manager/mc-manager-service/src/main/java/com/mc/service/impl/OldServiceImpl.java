package com.mc.service.impl;

import com.mc.common.pojo.McResult;
import com.mc.mapper.OldMapper;
import com.mc.pojo.Old;
import com.mc.service.OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OldServiceImpl implements OldService{
    @Autowired(required = false)
    private OldMapper oldMapper;

    @Override
    public McResult addOld(long account, String name, String sex, String age, String phone, String nation, String idCard, String information) {
        Old old=new Old();
        old.setAccount(account);
        old.setName(name);
        old.setSex(sex);
        old.setAge(age);
        old.setPhone(phone);
        old.setNation(nation);
        old.setIdCard(idCard);
        old.setInformation(information);
        oldMapper.addOld(old);
        return McResult.ok();
    }

    @Override
    public McResult updateOld(String sex, String age, String phone, String nation, String idCard, String information) {
        Old old=new Old();
        old.setSex(sex);
        old.setAge(age);
        old.setPhone(phone);
        old.setNation(nation);
        old.setIdCard(idCard);
        old.setInformation(information);
        oldMapper.updateOld(old);
        return McResult.ok();

    }

    @Override
    public Old findOldByName(String name) {
        Old result=oldMapper.findOldByName(name);
        return result;
    }

    @Override
    public Old findOldByPhone(String phone) {
        Old result=oldMapper.findOldByPhone(phone);
        return result;
    }
}
