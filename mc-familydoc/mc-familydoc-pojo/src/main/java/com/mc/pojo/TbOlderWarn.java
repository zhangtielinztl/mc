package com.mc.pojo;

import java.io.Serializable;

public class TbOlderWarn implements Serializable{
    private String olderName;
    private int age;
    private String sex;
    private String address;
    private String phone;

    public String getOlderName() {
        return olderName;
    }

    public void setOlderName(String olderName) {
        this.olderName = olderName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TbOlderWarn{" +
                "olderName='" + olderName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
