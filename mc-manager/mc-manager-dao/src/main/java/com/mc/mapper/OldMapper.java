package com.mc.mapper;

import com.mc.pojo.Old;

public interface OldMapper {
    /**
     *  添加一个老人信息到数据库
     * @param old 需要添加的老人信息
     */
     void addOld(Old old);
    /**
     *  根据老人姓名修改一个老人的信息
     * @param old 所要修改的老人
     */
    void updateOld(Old old);

    /**
     *  根据老人姓名来查询老人信息
     * @param name 所要查询的医院老人
     * @return 包含此名字的老人的信息
     */
    public Old findOldByName(String name);
    /**
     *  根据老人地址来查询老人信息
     * @param phone 所要查询的老人地址
     * @return 包含此地址的老人的信息
     */
    public Old findOldByPhone(String phone);

}
