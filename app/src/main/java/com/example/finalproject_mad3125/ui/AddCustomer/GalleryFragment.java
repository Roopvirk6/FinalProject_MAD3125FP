package com.example.finalproject_mad3125.ui.AddCustomer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.finalproject_mad3125.Bill;
import com.example.finalproject_mad3125.Customer;
import com.example.finalproject_mad3125.Hydro;
import com.example.finalproject_mad3125.Internet;
import com.example.finalproject_mad3125.Mobile;
import com.example.finalproject_mad3125.R;
import com.example.finalproject_mad3125.Singleton;
import com.example.finalproject_mad3125.ui.ShowDetails.ShowDetailsFragment;

public class GalleryFragment extends Fragment {


    Bundle bundle = new Bundle();
    EditText edtCustID;
    EditText edtFirstName;
    EditText edtLastName;
    EditText edtEmail;
    EditText edtAmount;
    RadioGroup rgbBillType;
    RadioButton rbHydro;
    RadioButton rbInternet;
    RadioButton rbMobile;
    LinearLayout linearHydroBill;
    EditText edtAgencyName;
    EditText edtUnitsConsumed;
    LinearLayout linearInternet;
    EditText edtProviderName;
    EditText edtInternetUsed;
    LinearLayout linearMobileBill;
    EditText edtManufacturerName;
    EditText edtPlanName;
    EditText edtMobileNumber;
    EditText edtInternetGBUsed;
    EditText edtMinutes;
    Button btnSave;


    Singleton singleton = Singleton.getInstance();
    String firstname;
    String lastName;
    String custID;
    String email;
    String btype;
    double amount;
    Bill bill = null;
    Customer customer = null;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        edtCustID = root.findViewById(R.id.edtCustID);
        edtFirstName = root.findViewById(R.id.edtFirstName);
        edtLastName = root.findViewById(R.id.edtLastName);
        edtEmail = root.findViewById(R.id.edtEmail);
        edtAmount = root.findViewById(R.id.edtAmount);
        rgbBillType = root.findViewById(R.id.rgbBillType);
        rbHydro = root.findViewById(R.id.rbHydro);
        rbMobile = root.findViewById(R.id.rbMobile);
        rbInternet = root.findViewById(R.id.rbInternet);
        edtAgencyName = root.findViewById(R.id.edtAgencyName);
        edtUnitsConsumed = root.findViewById(R.id.edtUnitsConsumed);
        edtProviderName = root.findViewById(R.id.edtProviderName);
        edtInternetUsed = root.findViewById(R.id.edtInternetUsed);
        edtManufacturerName = root.findViewById(R.id.edtManufacturerName);
        edtPlanName = root.findViewById(R.id.edtPlanName);
        edtMinutes = root.findViewById(R.id.edtMinutes);
        edtInternetGBUsed = root.findViewById(R.id.edtInternetGBUsed);
        edtMobileNumber = root.findViewById(R.id.edtMobileNumber);
        btnSave = root.findViewById(R.id.btnSave);
        linearHydroBill = root.findViewById(R.id.linearHydroBill);
        linearInternet = root.findViewById(R.id.linearInternet);
        linearMobileBill = root.findViewById(R.id.linearMobileBill);

        linearHydroBill.setVisibility(View.GONE);
        linearInternet.setVisibility(View.GONE);
        linearMobileBill.setVisibility(View.GONE);

        rgbBillType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                linearHydroBill.setVisibility(View.GONE);
                linearInternet.setVisibility(View.GONE);
                linearMobileBill.setVisibility(View.GONE);
                switch (i)
                {
                    case R.id.rbHydro:
                        linearHydroBill.setVisibility(View.VISIBLE);
                        break;

                    case R.id.rbInternet:
                        linearInternet.setVisibility(View.VISIBLE);

                        break;

                    case R.id.rbMobile:
                        linearMobileBill.setVisibility(View.VISIBLE);
                        break;
                }
            }

        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addData();
                getActivity().onBackPressed();
            }
        });

        return root;
    }

    public Customer addData()
    {
        firstname = edtFirstName.getText().toString();
        lastName = edtLastName.getText().toString();
        custID = edtCustID.getText().toString();
        email=edtEmail.getText().toString();
        amount = Double.parseDouble(edtAmount.getText().toString());
        Customer customer = new Customer();
        customer.setCustomerFirstName(firstname);
        customer.setCustomerLastName(lastName);
        customer.setCustomerId(custID);
        customer.setCustomerEmailAddress(email);
        customer.setAmount(amount);
        addDataBill(customer);
        singleton.addCustomer(customer);
        return customer;



    }

    public void addDataBill(Customer cust)
    {
        if (rbHydro.isChecked())
        {
            Hydro hydro = new Hydro();
            hydro.setBillID(edtCustID.getText().toString());
            hydro.setBillType("Hydro");
            hydro.setBillDate("02-01-2020");
            hydro.setBillAmount(300.0);
            cust.setBillType("Hydro");
            cust.setBill(hydro);
            bill = hydro;
        }

        if(rbInternet.isChecked())
        {
            Internet internet = new Internet();
            internet.setBillID(edtCustID.getText().toString());
            internet.setBillType("Internet");
            internet.setBillDate("02-02-2020");
            internet.setBillAmount(900.0);
            cust.setBillType("Internet");
            cust.setBill(internet);
            bill = internet;
        }

        if(rbMobile.isChecked())
        {
            Mobile mobile = new Mobile();
            mobile.setBillID(edtCustID.getText().toString());
            mobile.setBillType("Mobile");
            mobile.setBillDate("02-09-2020");
            mobile.setBillAmount(400.0);
            cust.setBill(mobile);
            cust.setBillType("Mobile");
            bill = mobile;
        }

    }

}
