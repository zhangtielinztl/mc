package com.mc.mapper;

import com.mc.pojo.Servicedian;

public interface ServicedianMapper {
    /**
     *  添加一个服务点信息到数据库
     * @param servicedian 需要添加的对象
     */
    void addServicedian(Servicedian servicedian);
    /**
     *  根据服务点名称修改一个服务点的信息
     * @param servicedian 要修改的对象
     */
    void updateServicedian(Servicedian servicedian);

    /**
     *  根据服务点名称删除一个服务点的信息
     * @param id 要删除的对象的id
     */
    Servicedian deleteServicedianById(long id);
}
