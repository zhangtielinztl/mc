package com.mc.service;

import com.mc.common.pojo.McResult;
import com.mc.pojo.Relate;

public interface RelateService {
    /**
     * 添加一个亲人信息到数据库
     */
    McResult addRelate(long account, String name, String sex, String age, String phone, String idCard, String information);

    /**
     * 根据亲人id修改一个亲人的信息
     */
    McResult updateRelate(String sex, String age, String phone, String idCard, String information);

    /**
     * 根据亲人姓名来查询亲人信息
     *
     * @param name 所要查询的亲人的名字
     * @return 包含此亲人姓名的对象
     */
    public Relate findRelateByName(String name);

    /**
     * 根据亲人手机号来查询亲人信息
     *
     * @param phone 所要查询的亲人的手机号
     * @return 包含此亲人手机号的对象
     */
    public Relate findRelateByPhone(String phone);
}