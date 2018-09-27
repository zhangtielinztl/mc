package com.mc.service;

import com.mc.pojo.TbReply;

import java.util.List;

public interface TbReplyService {
    /**
     * 显示回复咨询列表
     * @return
     */
    List<TbReply> showAll();
}
