package com.example.finalproject_mad3125;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Customer implements Serializable
{


    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmailAddress;
    private int amount;
    private int custImage;
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

    public Customer(int customerId,
                    String customerFirstName, String customerLastName, String customerEmailAddress, int amount, int custImage, String billType) {
        this.customerId=customerId;
        this.customerFirstName=customerFirstName;
        this.customerLastName=customerLastName;
        this.customerEmailAddress=customerEmailAddress;
        this.amount=amount;
        this.custImage=custImage;
        this.billType = billType;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCustImage() {
        return custImage;
    }

    public void setCustImage(int custImage) {
        this.custImage = custImage;
    }

    public void printMyData()
    {

    }




}
