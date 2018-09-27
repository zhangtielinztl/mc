package com.mc.service;

import com.mc.common.pojo.McResult;
import com.mc.pojo.Servicedian;

public interface ServicedianService {
    /**
     * 添加一个服务点信息到数据库
     * @param id 服务点id
     * @param name 服务点名称
     * @return
     */
    McResult addServicedian(long id, String name);
    /**
     * 修改一个服务点信息到数据库
     * @param id 服务点id
     * @param name 服务点名称
     * @return
     */
    McResult updateServicedian(long id, String name);

    /**
     *  根据服务点名称删除一个服务点的信息
     * @param id 要删除的对象的id
     */
    public Servicedian deleteServicedianById(long id);
}
