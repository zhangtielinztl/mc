package com.mc.mapper;

import com.mc.pojo.Doctor;

public interface DoctorMapper {
    /**
     *  添加一个医生信息到数据库
     * @param doctor 添加的对象
     */
    void addDoctor(Doctor doctor);
    /**
     *  根据医生姓名修改一个医生的信息
     * @param doctor 修改的对象
     */
    void updateDoctor(Doctor doctor);

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
