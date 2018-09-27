package com.mc.pojo;

import java.io.Serializable;

public class Warnsetting implements Serializable{
    private long id;
    private long warnsettingId;
    private String name;
    private String warnProject;
    private String unit;
    private String max;
    private String min;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getWarnsettingId() {
        return warnsettingId;
    }

    public void setWarnsettingId(long warnsettingId) {
        this.warnsettingId = warnsettingId;
    }
    public String getName() {
        return name;
    }

    public void setName(String oldName) {
        this.name = oldName;
    }

    public String getWarnProject() {
        return warnProject;
    }

    public void setWarnProject(String warnProject) {
        this.warnProject = warnProject;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "Warnsetting{" +
                "id=" + id +
                ", warnsettingId=" + warnsettingId +
                ", name='" + name + '\'' +
                ", warnProject='" + warnProject + '\'' +
                ", unit='" + unit + '\'' +
                ", max='" + max + '\'' +
                ", min='" + min + '\'' +
                '}';
    }
}
