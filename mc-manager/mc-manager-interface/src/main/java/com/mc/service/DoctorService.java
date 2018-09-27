package com.mc.service;

import com.mc.common.pojo.McResult;
import com.mc.pojo.Doctor;

public interface DoctorService {
    /**
     *  添加一个医生信息到数据库
     * @param id 需要添加的医生信息
     */
    McResult addDoctor(long id, String sex, String age, String phone, String nation, String idCard, String type, String hospital, String department, String information);
    /**
     *  根据医生id修改一个医生的信息
     * @param id 医生id
     */
    McResult updateDoctorByName(long id, String sex, String age, String phone, String nation, String idCard, String type, String hospital, String department, String information);

    /**
     *  根据医生姓名来查询医生信息
     * @param name 所要查询的医生的名字
     * @return 包含此医生姓名的对象
     */
    public Doctor findDoctorByName(String name);
    /**
     *  根据医生手机号来查询医生信息
     * @param phone 所要查询的医生的手机号
     * @return 包含此医生手机号的对象
     */
    public Doctor findDoctorByPhone(String phone);

}
