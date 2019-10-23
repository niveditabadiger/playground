package com.example.hp.fragmentreview.model;

import com.example.hp.fragmentreview.global.Status;

import java.io.Serializable;

public class Requestmodel implements Serializable {
    String Requestnum;
    Enum Requeststatus;
    String Requestdate;

    String items_desc;
    Integer items_qty;
    String items_date;
    Integer items_cost;

    public String getRequestnum() {
        return Requestnum;
    }

    public Enum getRequeststatus() {
        return Requeststatus;
    }

    public String getRequestdate() {
        return Requestdate;
    }

    public void setRequestnum(String requestnum) {
        Requestnum = requestnum;
    }

    public void setRequeststatus(Enum requeststatus) {
        this.Requeststatus = requeststatus;
    }

    public void setRequestdate(String requestdate) {
        Requestdate = requestdate;
    }

    public String getItems_desc() {
        return items_desc;
    }



    public String getItems_date() {
        return items_date;
    }



    public void setItems_desc(String items_desc) {
        this.items_desc = items_desc;
    }



    public void setItems_date(String items_date) {
        this.items_date = items_date;
    }


    public Integer getItems_qty() {
        return items_qty;
    }

    public Integer getItems_cost() {
        return items_cost;
    }

    public void setItems_qty(Integer items_qty) {
        this.items_qty = items_qty;
    }

    public void setItems_cost(Integer items_cost) {
        this.items_cost = items_cost;
    }


}
