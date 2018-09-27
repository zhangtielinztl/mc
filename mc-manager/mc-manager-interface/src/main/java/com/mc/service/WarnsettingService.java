package com.mc.service;

import com.mc.pojo.Warnsetting;

import java.util.List;

public interface WarnsettingService {
    /**
     * 查询指定内容下的所有内容
     * @return 当前指定内容下的所有内容
     */
    List<Warnsetting> findWarnsettingAll();
    /**
     * 根据老人姓名查询对应老人信息
     * @param name 老人姓名
     * @return 此老人所有的信息
     */
    List<Warnsetting> findWarnsettingByName(String name);
    /**
     *  根据老人名字来进行批量删除
     * @param id 老人编号
     */
    List<Warnsetting> deleteWarnsettingById(long id);
}
