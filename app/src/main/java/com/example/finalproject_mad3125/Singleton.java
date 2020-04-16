package com.example.finalproject_mad3125;

import java.util.ArrayList;

public class Singleton
{
    private static Singleton myObj;

    ArrayList<Customer> arrayListCustomer = new ArrayList<>();
    private Singleton()
    {
        arrayListCustomer = new ArrayList<>();
       // Customer c1 = new Customer(1,"roop","virk","roop@gmail.com",1000,,"mobile");
        Mobile m1 = new Mobile(1,"02-01-2020","Mobile",1000.0,"rogers","calling+talktime",12455,10,60);
    }
}
