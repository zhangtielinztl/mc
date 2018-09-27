package com.mc.mapper;

import com.mc.pojo.Relate;

public interface RelateMapper {
    /**
     *  添加一个亲人信息到数据库
     * @param relate 需要添加的亲人信息
     */
    void addRelate(Relate relate);
    /**
     *  根据亲人姓名修改一个亲人的信息
     * @param relate 所要修改的亲人
     */
    void updateRelate(Relate relate);

    /**
     *  根据亲人姓名来查询亲人信息
     * @param name 所要查询的亲人
     * @return 包含此名字的亲人的信息
     */
    public Relate findRelateByName(String name);
    /**
     *  根据亲人地址来查询亲人信息
     * @param phone 所要查询的亲人地址
     * @return 包含此地址的亲人的信息
     */
    public Relate findRelateByPhone(String phone);
}
