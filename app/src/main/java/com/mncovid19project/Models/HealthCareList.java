package com.mncovid19project.Models;

public class HealthCareList {

    String sno, beds, hospital, type;

    public HealthCareList() {
    }

    public HealthCareList(String sno, String beds, String hospital, String type) {
        this.sno = sno;
        this.beds = beds;
        this.hospital = hospital;
        this.type = type;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
