package com.mc.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbReply implements Serializable{
private int id;
private String name;
private String title;
private String describe;
private Date seekDate;
private String status;
private String operation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getSeekDate() {
        return seekDate;
    }

    public void setSeekDate(Date seekDate) {
        this.seekDate = seekDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "TbReply{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", describe='" + describe + '\'' +
                ", seekDate=" + seekDate +
                ", status='" + status + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
