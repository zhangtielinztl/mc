package com.mc.service;

import com.mc.common.pojo.McResult;
import com.mc.pojo.Community;

public interface CommunityService {
    /**
     * 添加一个社区信息到数据库
     */
    McResult addCommunity(long account, String name, String phone, String email, String phone1, String address, String introduce);

    /**
     * 根据社区id修改一个社区的信息
     */
    McResult updateCommunity(String phone, String email, String phone1, String address, String introduce);

    /**
     * 根据社区姓名来查询社区信息
     *
     * @param name 所要查询的社区的名字
     * @return 包含此社区姓名的对象
     */
    public Community findCommunityByName(String name);

    /**
     * 根据社区手机号来查询社区信息
     *
     * @param phone 所要查询的社区的手机号
     * @return 包含此社区手机号的对象
     */
    public Community findCommunityByPhone(String phone);
}
