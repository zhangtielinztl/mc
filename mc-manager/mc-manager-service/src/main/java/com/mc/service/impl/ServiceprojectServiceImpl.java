package com.mc.service.impl;

import com.mc.mapper.ServiceprojectMapper;
import com.mc.pojo.Serviceproject;
import com.mc.service.ServiceprojectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceprojectServiceImpl implements ServiceprojectService{
@Autowired(required = false)
    private ServiceprojectMapper serviceprojectMapper;

    @Override
    public List<Serviceproject> findAll(long id1) {
        List<Serviceproject> result=serviceprojectMapper.findAll(id1);
        return result;
    }

    @Override
    public Serviceproject findServiceprojectById(long id) {
        Serviceproject result=serviceprojectMapper.findServiceprojectById(id);
        return result;
    }

    @Override
    public Serviceproject findServiceprojectByName(String name) {
        Serviceproject result=serviceprojectMapper.findServiceprojectByName(name);
        return result;
    }

    @Override
    public List<Serviceproject> deleteServiceprojectById(long id) {
        List<Serviceproject> result=serviceprojectMapper.deleteServiceprojectById(id);
        return result;
    }
}
