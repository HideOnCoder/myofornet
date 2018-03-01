package com.hust.ofornet.pojo;

import java.util.Date;

public class Employment {
    private Integer id;

    private String employmentCode;

    private Integer uid;

    private Integer jobid;

    private String message;

    private Date createDate;

    private String employStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmploymentCode() {
        return employmentCode;
    }

    public void setEmploymentCode(String employmentCode) {
        this.employmentCode = employmentCode == null ? null : employmentCode.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmployStatus() {
        return employStatus;
    }

    public void setEmployStatus(String employStatus) {
        this.employStatus = employStatus == null ? null : employStatus.trim();
    }
}