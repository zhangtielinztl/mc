package com.mc.service.impl;

import com.mc.mapper.WarnsettingMapper;
import com.mc.pojo.Warnsetting;
import com.mc.service.WarnsettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarnsettingServiceImpl implements WarnsettingService{
    @Autowired(required = false)
    private WarnsettingMapper warnsettingMapper;

    @Override
    public List<Warnsetting> findWarnsettingAll() {
        List<Warnsetting> result=warnsettingMapper.findWarnsettingAll();
        return result;
    }


    @Override
    public List<Warnsetting> findWarnsettingByName(String name) {
        List<Warnsetting> result=warnsettingMapper.findWarnsettingByName(name);
        return result;
    }

    @Override
    public List<Warnsetting> deleteWarnsettingById(long id) {
        List<Warnsetting> result= warnsettingMapper.deleteWarnsettingById(id);
        return result;
    }


}
