package com.example.finalproject_mad3125;

import java.io.Serializable;

public class Hydro extends Bill implements Serializable
{
    private String agencyName;
    private String unitConsumed;

    public Hydro()
    {
        super();
    }

    public Hydro(int billID, String billDate, String billType, double billAmount, String agencyName, String unitConsumed)
    {
        super(billID,billDate,"Hydro",billAmount);
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(String unitConsumed) {
        this.unitConsumed = unitConsumed;
    }

    public void Bill()
    {

    }

    @Override
    public void printMyData()
    {
        System.out.println("Customer has a Hydro bill ");
        System.out.println("\t:Bill ID:          " + getBillID());
        System.out.println("\tBill Date:   " + getBillDate());
        System.out.println("\tBill Type:           " + getBillType());
        System.out.println("\tBill Amount:" + getBillAmount());
        System.out.println("\tAgency Name:     " + getAgencyName());
        System.out.println("\tUnits Consumed:   " + getUnitConsumed());

    }
}
