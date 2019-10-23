package com.carmel.bootcamp.nivedita.model;

import java.io.Serializable;

public class Requestmodel implements Serializable {
        String reuestid;
        Enum requeststatus;
        String requestdate;


    public String getReuestid() {
        return reuestid;
    }

    public Enum getRequeststatus() {
        return requeststatus;
    }



    public void setReuestid(String reuestid) {
        this.reuestid = reuestid;
    }

    public void setRequeststatus(Enum requeststatus) {
        this.requeststatus = requeststatus;
    }


    public String getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(String requestdate) {
        this.requestdate = requestdate;
    }
}

