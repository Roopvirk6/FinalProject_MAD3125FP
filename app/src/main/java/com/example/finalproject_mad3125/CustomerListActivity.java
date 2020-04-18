package com.example.finalproject_mad3125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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


        HydroLayout.setVisibility(View.GONE);
        InternetLayout.setVisibility(View.GONE);
        MobileLayout.setVisibility(View.GONE);

        Customer e = (Customer) getIntent().getSerializableExtra("customer");
        Bill b = (Bill) getIntent().getSerializableExtra("bill");
        System.out.println(e.getCustomerId());
        System.out.println(e.getCustomerFirstName());
        System.out.println(e.getCustomerLastName());
        System.out.println(e.getCustomerEmailAddress());
        System.out.println(e.getAmount());

        edtCustomerIds.setText(String.valueOf(e.getCustomerId()));
        edtFirstNames.setText(String.valueOf(e.getCustomerFirstName()));
        edtLastNames.setText(String.valueOf(e.getCustomerLastName()));
        edtEmailAddresss.setText(String.valueOf(e.getCustomerEmailAddress()));
        edtAmounts.setText(String.valueOf(e.getAmount()));

        if (b instanceof Hydro) {
            HydroLayout.setVisibility(View.VISIBLE);
            edtAgencyNames.setText(((Hydro) b).getAgencyName());
            edtUnitConsumeds.setText(String.valueOf(((Hydro) b).getUnitConsumed()));
        }

        if (b instanceof Internet) {
            InternetLayout.setVisibility(View.VISIBLE);
            edtProviderNames.setText(((Internet) b).getProviderName());
            edtUnitConsumedGB.setText(String.valueOf(((Internet) b).getInternetGB())+ "GB");
        }

        if (b instanceof Mobile)
        {
            MobileLayout.setVisibility(View.VISIBLE);
            edtManufacturerNames.setText(((Mobile) b).getManufacturerName());
            edtMinutesUsed.setText(String.valueOf(((Mobile) b).getMinutes())+ "minutes");
            edtInternetGBUsed.setText(String.valueOf(((Mobile) b).getInternetGBUesd())+ "GB");
            edtPlanNames.setText(((Mobile) b).getPlanName());
            edtMobileNumbers.setText(((Mobile) b).getMobileNumber());




        }


    }


}
