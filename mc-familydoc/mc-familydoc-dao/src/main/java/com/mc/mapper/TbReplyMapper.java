package com.mc.mapper;

import com.mc.pojo.TbReply;

import java.util.List;

public interface TbReplyMapper {
    /**
     * 根据姓名查询回复咨询列表
     * @param
     * @return 整个列表信息
     */
    List<TbReply> getTbReply();
}
