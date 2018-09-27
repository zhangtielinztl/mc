package com.mc.pojo;

import java.io.Serializable;

public class TbDoctor implements Serializable{
private String docName;
private int age;
private String address;
private String phone;

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIpone() {
        return phone;
    }

    public void setIpone(String ipone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TbDoctor{" +
                "docName='" + docName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", ipone='" + phone+ '\'' +
                '}';
    }
}
