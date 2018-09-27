package com.mc.mapper;

import com.mc.pojo.Warninformation;

import java.util.List;

public interface WarninformationMapper {
    /**
     * 根据预警项目查询预警信息
     * @param warnProject 预警项目
     * @return 所有这个预警项目的处理情况
     */
    List<Warninformation> findWarninformationrByWarnProject(String warnProject);
    /**
     * 根据处理状态查询预警信息
     * @param state 预警状态
     * @return 所有这个预警项目的处理情况
     */
    List<Warninformation> findWarninformationByState(String state);
}
