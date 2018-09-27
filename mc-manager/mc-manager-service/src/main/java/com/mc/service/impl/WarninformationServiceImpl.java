package com.mc.service.impl;

import com.mc.mapper.WarninformationMapper;
import com.mc.pojo.Warninformation;
import com.mc.service.WarninformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WarninformationServiceImpl implements WarninformationService{
    @Autowired(required = false)
    private WarninformationMapper warninformationMapper;
    @Override
    public List<Warninformation> findWarninformationrByWarnProject(String warnProject) {
        List<Warninformation> result=warninformationMapper.findWarninformationrByWarnProject(warnProject);
        return result;
    }

    @Override
    public List<Warninformation> findWarninformationByState(String state) {
        List<Warninformation> result1=warninformationMapper.findWarninformationByState(state);
        return result1;
    }
}
