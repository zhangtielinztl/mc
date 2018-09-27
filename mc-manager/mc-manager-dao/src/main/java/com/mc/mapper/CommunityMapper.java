package com.mc.mapper;

import com.mc.pojo.Community;

public interface CommunityMapper {
    /**
     *  添加一个社区信息到数据库
     * @param service 需要添加的社区信息
     */
    void addCommunity(Community service);
    /**
     *  根据社区姓名修改一个社区的信息
     * @param service 所要修改的社区
     */
    void updateCommunity(Community service);

    /**
     *  根据社区姓名来查询社区信息
     * @param name 所要查询的医院社区
     * @return 包含此名字的社区的信息
     */
    public Community findCommunityByName(String name);
    /**
     *  根据社区地址来查询社区信息
     * @param phone 所要查询的社区地址
     * @return 包含此地址的社区的信息
     */
    public Community findCommunityByPhone(String phone);
}
