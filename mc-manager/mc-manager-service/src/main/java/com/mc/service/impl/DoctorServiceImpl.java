package com.mc.service.impl;

import com.mc.common.pojo.McResult;
import com.mc.mapper.DoctorMapper;
import com.mc.pojo.Doctor;
import com.mc.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired(required = false)
    private DoctorMapper doctorMapper;


    @Override
    public McResult addDoctor(long id, String sex, String age, String phone, String nation, String idCard, String type, String hospital, String department, String information) {
        Doctor doctor=new Doctor();
        doctor.setId(id);
        doctor.setSex(sex);
        doctor.setAge(age);
        doctor.setPhone(phone);
        doctor.setNation(nation);
        doctor.setIdCard(idCard);
        doctor.setType(type);
        doctor.setHospital(hospital);
        doctor.setDepartment(department);
        doctor.setInformation(information);
        doctorMapper.addDoctor(doctor);
        return McResult.ok();
    }

    @Override
    public McResult updateDoctorByName(long id, String sex, String age, String phone, String nation, String idCard, String type, String hospital, String department, String information) {
        Doctor doctor=new Doctor();
        doctor.setId(id);
        doctor.setSex(sex);
        doctor.setAge(age);
        doctor.setPhone(phone);
        doctor.setNation(nation);
        doctor.setIdCard(idCard);
        doctor.setType(type);
        doctor.setHospital(hospital);
        doctor.setDepartment(department);
        doctor.setInformation(information);
        doctorMapper.updateDoctor(doctor);
        return McResult.ok();
    }

    @Override
    public Doctor findDoctorByName(String name) {
       Doctor result=doctorMapper.findDoctorByName(name);
       return result;
    }

    @Override
    public Doctor findDoctorByPhone(String phone) {
        Doctor result=doctorMapper.findDoctorByPhone(phone);
        return result;
    }
}
