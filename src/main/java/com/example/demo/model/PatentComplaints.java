package com.example.demo.model;


public class PatentComplaints {
    private Integer complaintId;
    private Integer intellectuatPropertyId;
    private String complaintTime;
    private Integer userId;
    private Boolean complaintProcess;
    private String complaintType;
    private String  complaintIntro;
    private Boolean tableStatus;;

    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    public Integer getIntellectuatPropertyId() {
        return intellectuatPropertyId;
    }

    public void setIntellectuatPropertyId(Integer intellectuatPropertyId) {
        this.intellectuatPropertyId = intellectuatPropertyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComplaintIntro() {
        return complaintIntro;
    }

    public void setComplaintIntro(String complaintIntro) {
        this.complaintIntro = complaintIntro;
    }

    public Boolean getComplaintProcess() {
        return complaintProcess;
    }

    public void setComplaintProcess(Boolean complaintProcess) {
        this.complaintProcess = complaintProcess;
    }

    public String getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(String complaintTime) {
        this.complaintTime = complaintTime;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public Boolean getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(Boolean tableStatus) {
        this.tableStatus = tableStatus;
    }
}
