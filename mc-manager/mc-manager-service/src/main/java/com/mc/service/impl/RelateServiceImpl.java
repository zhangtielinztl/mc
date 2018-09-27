package com.mc.service.impl;

import com.mc.common.pojo.McResult;
import com.mc.mapper.RelateMapper;
import com.mc.pojo.Relate;
import com.mc.service.RelateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelateServiceImpl implements RelateService{
    @Autowired(required = false)
    private RelateMapper relateMapper;

    @Override
    public McResult addRelate(long account, String name, String sex, String age, String phone, String idCard, String information) {
        Relate relate=new Relate();
        relate.setAccount(account);
        relate.setName(name);
        relate.setSex(sex);
        relate.setAge(age);
        relate.setPhone(phone);
        relate.setIdCard(idCard);
        relate.setInformation(information);
        relateMapper.addRelate(relate);
        return McResult.ok();
    }

    @Override
    public McResult updateRelate(String sex, String age, String phone, String idCard, String information) {
        Relate relate=new Relate();
        relate.setSex(sex);
        relate.setAge(age);
        relate.setPhone(phone);
        relate.setIdCard(idCard);
        relate.setInformation(information);
        relateMapper.updateRelate(relate);
        return McResult.ok();
    }

    @Override
    public Relate findRelateByName(String name) {
        Relate result=relateMapper.findRelateByName(name);
        return result;
    }

    @Override
    public Relate findRelateByPhone(String phone) {
        Relate result=relateMapper.findRelateByPhone(phone);
        return result;
    }
}
