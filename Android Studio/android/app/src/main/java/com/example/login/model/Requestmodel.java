package com.example.login.model;

import com.example.login.global.Status;

import java.io.Serializable;

public class Requestmodel implements Serializable {
    String Requestnum;
    Status Requeststatus;
    String Requestdate;

    public String getRequestnum() {
        return Requestnum;
    }

    public void setRequestnum(String requestnum) {
        Requestnum = requestnum;
    }

    public Status getRequeststatus() {
        return Requeststatus;
    }

    public void setRequeststatus(Status requeststatus) {
        Requeststatus = requeststatus;
    }

    public String getRequestdate() {
        return Requestdate;
    }

    public void setRequestdate(String requestdate) {
        Requestdate = requestdate;
    }
}
