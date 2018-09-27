package com.mc.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbEstimate implements Serializable{
private int id;
private String olderName;
private String docName;
private String heaStatus;
private String heaData;
private String docPropose;
private Date estimateDate;
private String operation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOlderName() {
        return olderName;
    }

    public void setOlderName(String olderName) {
        this.olderName = olderName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getHeaStatus() {
        return heaStatus;
    }

    public void setHeaStatus(String heaStatus) {
        this.heaStatus = heaStatus;
    }

    public String getHeaData() {
        return heaData;
    }

    public void setHeaData(String heaData) {
        this.heaData = heaData;
    }

    public String getDocPropose() {
        return docPropose;
    }

    public void setDocPropose(String docPropose) {
        this.docPropose = docPropose;
    }

    public Date getSeekDate() {
        return estimateDate;
    }

    public void setSeekDate(Date seekDate) {
        this.estimateDate = estimateDate;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "TbEstimate{" +
                "id=" + id +
                ", olderName='" + olderName + '\'' +
                ", docName='" + docName + '\'' +
                ", heaStatus='" + heaStatus + '\'' +
                ", heaData='" + heaData + '\'' +
                ", docPropose='" + docPropose + '\'' +
                ", seekDate=" + estimateDate +
                ", operation='" + operation + '\'' +
                '}';
    }
}
