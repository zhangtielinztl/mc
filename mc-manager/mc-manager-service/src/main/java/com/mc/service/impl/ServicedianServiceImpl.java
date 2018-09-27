package com.mc.service.impl;

import com.mc.common.pojo.McResult;
import com.mc.mapper.ServicedianMapper;
import com.mc.pojo.Servicedian;
import com.mc.service.ServicedianService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicedianServiceImpl implements ServicedianService{
    @Autowired(required = false)
    private ServicedianMapper servicedianMapper;

    @Override
    public McResult addServicedian(long id,String name) {
        Servicedian servicedian=new Servicedian();
        servicedian.setId(id);
        servicedian.setName(name);
        servicedianMapper.addServicedian(servicedian);
        return McResult.ok();
    }

    @Override
    public McResult updateServicedian(long id,String name) {
        Servicedian servicedian=new Servicedian();
        servicedian.setName(name);
        servicedianMapper.updateServicedian(servicedian);
        return McResult.ok();
    }

    public Servicedian deleteServicedianById(long id) {
        Servicedian result=servicedianMapper.deleteServicedianById(id);
        return result;
    }
}
