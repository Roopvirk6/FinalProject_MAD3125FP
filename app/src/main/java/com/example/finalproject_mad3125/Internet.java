package com.example.finalproject_mad3125;

import java.io.Serializable;

public class Internet extends Bill implements Serializable {

        private String providerName;
        private double internetGB;

        public Internet(){
            super();
        }

        public Internet(String billID, String billDate, String billType, double billAmount, String providerName, double internetGB )
        {
            super(billID,billDate,"Internet",billAmount);
            this.providerName = providerName;
            this.internetGB = internetGB;
        }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public double getInternetGB() {
        return internetGB;
    }

    public void setInternetGB(double internetGB) {
        this.internetGB = internetGB;
    }

    public void Bill()
        {

        }

        @Override
        public void printMyData()
        {
            System.out.println("Customer has a mobile bill of ");
            System.out.println("\tBill ID:           " + getBillID());
            System.out.println("\tBill Type:   " + getBillType());
            System.out.println("\tBill Date:           " + getBillDate());
            System.out.println("\tBill Amount:  " + getBillAmount());
            System.out.println("\tProvider Name:      " + getProviderName());
            System.out.println("\tInternet Used:       "+ getInternetGB()+"GB");
        }
    }


