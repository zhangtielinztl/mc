package com.mc.service.impl;

import com.mc.common.pojo.McResult;
import com.mc.mapper.HospitalMapper;
import com.mc.pojo.Hospital;
import com.mc.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService{
    @Autowired(required = false)
    private HospitalMapper hospitalMapper;

    @Override
    public Hospital deleteHospitalByName(String name) {
        Hospital result=hospitalMapper.deleteHospitalByName(name);
        return result;
    }

    @Override
    public McResult updateHospitalByName(String name, String address, String information, String department, String doctor) {
        Hospital hospital=new Hospital();
        hospital.setName(name);
        hospital.setAddress(address);
        hospital.setInformation(information);
        hospital.setDepartment(department);
        hospital.setDoctor(doctor);
        hospitalMapper.updateHospital(hospital);
        return McResult.ok();
    }

    @Override
    public Hospital findHospitalByName(String name) {
        Hospital result=hospitalMapper.findHospitalByName(name);
        return result;
    }

    @Override
    public Hospital findHospitalByAddress(String address) {
        Hospital result=hospitalMapper.findHospitalByAddress(address);
        return result;
    }
}
