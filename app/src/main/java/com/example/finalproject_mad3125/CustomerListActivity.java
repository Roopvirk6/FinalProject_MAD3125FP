package com.example.finalproject_mad3125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomerListActivity extends AppCompatActivity {

    TextView edtCustomerIds;
    TextView edtFirstNames;
    TextView edtLastNames;
    TextView edtEmailAddresss;
    TextView edtAmounts;
    TextView edtAgencyNames;
    TextView edtUnitConsumeds;
    TextView edtProviderNames;
    TextView edtUnitConsumedGB;
    TextView edtManufacturerNames;
    TextView edtMobileNumbers;
    TextView edtPlanNames;
    TextView edtMinutesUsed;
    TextView edtInternetGBUsed;
    LinearLayout HydroLayout;
    LinearLayout InternetLayout;
    LinearLayout MobileLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        edtCustomerIds = findViewById(R.id.textView12);
        edtFirstNames = findViewById(R.id.textView13);
        edtLastNames = findViewById(R.id.textView14);
        edtEmailAddresss = findViewById(R.id.textView15);
        edtAmounts = findViewById(R.id.textView16);
        edtAgencyNames = findViewById(R.id.textView17);
        edtUnitConsumeds = findViewById(R.id.textView18);
        edtProviderNames = findViewById(R.id.textView19);
        edtUnitConsumedGB = findViewById(R.id.textView20);
        edtManufacturerNames = findViewById(R.id.textView21);
        edtMobileNumbers = findViewById(R.id.textView22);
        edtPlanNames = findViewById(R.id.textView23);
        edtMinutesUsed = findViewById(R.id.textView24);
        edtInternetGBUsed = findViewById(R.id.textView25);
        HydroLayout = findViewById(R.id.HydroLayout);
        InternetLayout = findViewById(R.id.linearInternet1);
        MobileLayout = findViewById(R.id.MobileLayout);
    }


    
}
