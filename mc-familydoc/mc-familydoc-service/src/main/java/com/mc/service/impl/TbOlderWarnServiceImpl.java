package com.mc.service.impl;

import com.mc.mapper.TbOlderWarnMapper;
import com.mc.pojo.TbOlderWarn;
import com.mc.service.TbOlderWarnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbOlderWarnServiceImpl implements TbOlderWarnService {
    @Autowired
    private TbOlderWarnMapper tbOlderWarnMapper;
    @Override
    public TbOlderWarn showTbOlder(String olderName) {
        TbOlderWarn tbOlderByName = tbOlderWarnMapper.getTbOlderByName(olderName);
        return tbOlderByName;
    }
}
