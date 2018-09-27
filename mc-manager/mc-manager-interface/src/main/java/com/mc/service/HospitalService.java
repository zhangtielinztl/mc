package com.mc.service;

import com.mc.common.pojo.McResult;
import com.mc.pojo.Hospital;

public interface HospitalService {
    /**
     * 根据医院名字删除医院信息
     * @param name 医院名字
     */
    Hospital deleteHospitalByName(String name);
    /**
     *  根据医院名字来修改医院信息
     */
    McResult updateHospitalByName(String name, String address, String information, String department, String doctor);

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
