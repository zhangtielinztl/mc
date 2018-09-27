package com.mc.mapper;

import com.mc.pojo.Hospital;

public interface HospitalMapper {
    /**
     * 根据医院名字删除医院信息
     * @param name 医院名字
     */
    Hospital deleteHospitalByName(String name);
    /**
     *  根据医院名字来修改医院信息
     * @param hospital 所要修改的对象
     */
    void updateHospital(Hospital hospital);

    /**
     *  根据医院姓名来查询医院信息
     * @param name 所要查询的医院名字
     * @return 包含此名字的医院的信息
     */
    public Hospital findHospitalByName(String name);
    /**
     *  根据医院地址来查询医院信息
     * @param address 所要查询的医院地址
     * @return 包含此地址的医院的信息
     */
    public Hospital findHospitalByAddress(String address);
}
