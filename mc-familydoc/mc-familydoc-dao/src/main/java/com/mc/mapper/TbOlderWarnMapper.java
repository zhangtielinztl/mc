package com.mc.mapper;

import com.mc.pojo.TbOlderWarn;

public interface TbOlderWarnMapper {
    /**
     * 根据姓名查询老人信息
     * @return 老人信息
     */
    TbOlderWarn getTbOlderByName(String olderName);
}
