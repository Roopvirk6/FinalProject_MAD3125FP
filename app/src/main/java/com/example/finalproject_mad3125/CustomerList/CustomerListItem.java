package com.example.finalproject_mad3125.CustomerList;

public class CustomerListItem
{
    private String customerFirstName;
    private String customerEmailAddress;

    public CustomerListItem(String customerFirstName, String customerEmailAddress)
    {
        super();
        this.customerFirstName = customerFirstName;
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
}
