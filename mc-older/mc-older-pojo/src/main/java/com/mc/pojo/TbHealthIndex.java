package com.mc.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbHealthIndex  implements Serializable{
    private Long olderId;
    private String bloodPressure;
    private String glycemic;
    private String bloodOxygen;
    private String heightWeght;
    private String fat;
    private String cholesterol;
    private String heartRate;
    private String electrocardiographic;
    private String hemoglobin;
    private Date createtime;

    public Long getOlderId() {
        return olderId;
    }

    public void setOlderId(Long olderId) {
        this.olderId = olderId;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getGlycemic() {
        return glycemic;
    }

    public void setGlycemic(String glycemic) {
        this.glycemic = glycemic;
    }

    public String getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(String bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public String getHeightWeght() {
        return heightWeght;
    }

    public void setHeightWeght(String heightWeght) {
        this.heightWeght = heightWeght;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(String cholesterol) {
        this.cholesterol = cholesterol;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getElectrocardiographic() {
        return electrocardiographic;
    }

    public void setElectrocardiographic(String electrocardiographic) {
        this.electrocardiographic = electrocardiographic;
    }

    public String getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(String hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "TbHealthIndex{" +
                "olderId=" + olderId +
                ", bloodPressure='" + bloodPressure + '\'' +
                ", glycemic='" + glycemic + '\'' +
                ", bloodOxygen='" + bloodOxygen + '\'' +
                ", heightWeght='" + heightWeght + '\'' +
                ", fat='" + fat + '\'' +
                ", cholesterol='" + cholesterol + '\'' +
                ", heartRate='" + heartRate + '\'' +
                ", electrocardiographic='" + electrocardiographic + '\'' +
                ", hemoglobin='" + hemoglobin + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
