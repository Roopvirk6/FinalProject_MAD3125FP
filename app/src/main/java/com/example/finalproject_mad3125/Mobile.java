package com.example.finalproject_mad3125;

import java.io.Serializable;

public class Mobile extends Bill implements Serializable
{
    private String manufacturerName;
    private String planName;
    private String mobileNumber;
    private double internetGBUesd;
    private double minutes;

    public Mobile()
    {
        super();
    }

    public Mobile(String billID, String billDate, String billType, double billAmount, String manufacturerName, String planName,
                 String mobileNumber, double internetGBUesd, double minutes)
    {
        super(billID,billDate,"Mobile",billAmount);
        this.manufacturerName = manufacturerName;
        this.planName = planName;
        this.mobileNumber = mobileNumber;
        this.internetGBUesd = internetGBUesd;
        this.minutes = minutes;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getInternetGBUesd() {
        return internetGBUesd;
    }

    public void setInternetGBUesd(double internetGBUesd) {
        this.internetGBUesd = internetGBUesd;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public void Bill()
    {

    }

    @Override
    public void printMyData()
    {
        System.out.println("Customer has a Mobile bill ");
        System.out.println("\t:Bill ID:          " + getBillID());
        System.out.println("\tBill Date:   " + getBillDate());
        System.out.println("\tBill Type:           " + getBillType());
        System.out.println("\tBill Amount:" + getBillAmount());
        System.out.println("\tManufacturer Name:     " + getManufacturerName());
        System.out.println("\tPlan Name:        " + getPlanName());
        System.out.println("\tInternet GB Used:   "+ getInternetGBUesd());
        System.out.println("\tMinutes Used:       " + getMinutes());
        System.out.println("\tMobile Number:       " + getMobileNumber());

    }

}
