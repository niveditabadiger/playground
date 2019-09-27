package com.example.hp.fragmentreview.model;

import com.example.hp.fragmentreview.global.Status;

import java.io.Serializable;

public class Requestmodel implements Serializable {
    String Requestnum;
    Status Requeststatus;
    String Requestdate;

    public String getRequestnum() {
        return Requestnum;
    }

    public Status getRequeststatus() {
        return Requeststatus;
    }

    public String getRequestdate() {
        return Requestdate;
    }

    public void setRequestnum(String requestnum) {
        Requestnum = requestnum;
    }

    public void setRequeststatus(Status requeststatus) {
        Requeststatus = requeststatus;
    }

    public void setRequestdate(String requestdate) {
        Requestdate = requestdate;
    }
}
