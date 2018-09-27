package com.mc.service.impl;

import com.mc.mapper.TbReplyMapper;
import com.mc.pojo.TbReply;
import com.mc.service.TbReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbReplyServiceImpl implements TbReplyService {
    @Autowired
    private TbReplyMapper tbReplyMapper;
    @Override
    public List<TbReply> showAll() {

        List<TbReply> replies = tbReplyMapper.getTbReply();

        return replies;
    }
}
