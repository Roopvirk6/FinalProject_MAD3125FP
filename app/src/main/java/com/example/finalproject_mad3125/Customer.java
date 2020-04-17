package com.example.finalproject_mad3125;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Customer implements Serializable
{


    private String customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmailAddress;
    private double amount;

    private Bill bill;
    private String billType;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getBillType() {
        billType=bill.getBillType();

        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }


    public Customer()
    {

    }

    public Customer(String customerId,
                    String customerFirstName, String customerLastName, String customerEmailAddress, double amount, String billType) {
        this.customerId=customerId;
        this.customerFirstName=customerFirstName;
        this.customerLastName=customerLastName;
        this.customerEmailAddress=customerEmailAddress;
        this.amount=amount;

        this.billType = billType;
    }


    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void printMyData()
    {

    }




}
