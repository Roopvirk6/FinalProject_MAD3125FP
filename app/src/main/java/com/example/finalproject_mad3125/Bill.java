package com.example.finalproject_mad3125;

import java.io.Serializable;

public abstract class Bill implements Serializable
{
    private int billID;
    private String billDate;
    private String billType;
    private double billAmount;

    public Bill()
    {

    }

    public Bill(int billID, String billDate, String BType,double billAmount)
    {
        this.billID = billID;
        this.billDate = billDate;
        this.billType = BType;
        this.billAmount = billAmount;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public abstract void Bill();

    public void printMyData()
    {

    }

}
