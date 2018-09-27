package com.mc.mapper;

import com.mc.pojo.Serviceproject;

import java.util.List;

public interface ServiceprojectMapper {
    /**
     * 根据类目id显示全部服务项目
     * @param id1 类目id
     * @return 包含id1的所有对象
     */
    List<Serviceproject> findAll(long id1);

    /**
     * 根据id来查询服务项目
     * @param id 包含id的对象
     * @return 符合此id的对象
     */
    Serviceproject findServiceprojectById(long id);
    /**
     * 根据名称来查询服务项目
     * @param name 包含名称的对象
     * @return 符合此名称的对象
     */
    Serviceproject findServiceprojectByName(String name);
    /**
     *  根据id来进行批量删除
     * @param id 项目编号
     */
    List<Serviceproject> deleteServiceprojectById(long id);
}
