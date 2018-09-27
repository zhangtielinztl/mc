package com.mc.pojo;

public class Warninformation {
    private long id;
    private long warninformationId;
    private String oldName;
    private String warnProject;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWarninformationId() {
        return warninformationId;
    }

    public void setWarninformationId(long warninformationId) {
        this.warninformationId = warninformationId;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getWarnProject() {
        return warnProject;
    }

    public void setWarnProject(String warnProject) {
        this.warnProject = warnProject;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
