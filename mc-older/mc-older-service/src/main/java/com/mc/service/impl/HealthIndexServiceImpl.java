package com.mc.service.impl;

import com.mc.mapper.TbHealthIndexMapper;
import com.mc.pojo.TbHealthIndex;
import com.mc.service.HealthIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthIndexServiceImpl implements HealthIndexService {
    @Autowired
    private TbHealthIndexMapper tbHealthIndexMapper;


    @Override
    public List<TbHealthIndex> findTbHealthIndexAll() {
        List<TbHealthIndex> tbHealthIndex=tbHealthIndexMapper.getTbHealthIndex();
        return tbHealthIndex;
    }

    @Override
    public void addTbHealthIndex(TbHealthIndex healthIndex) {

         tbHealthIndexMapper.addTbHealthIndex(healthIndex);
    }
}
