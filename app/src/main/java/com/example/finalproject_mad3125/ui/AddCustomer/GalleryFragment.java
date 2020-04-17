package com.example.finalproject_mad3125.ui.AddCustomer;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.finalproject_mad3125.Bill;
import com.example.finalproject_mad3125.Customer;
import com.example.finalproject_mad3125.Hydro;
import com.example.finalproject_mad3125.Internet;
import com.example.finalproject_mad3125.Mobile;
import com.example.finalproject_mad3125.R;
import com.example.finalproject_mad3125.Singleton;

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
    Button btnSave;

    Singleton singleton = Singleton.getInstance();
    String firstname;
    String lastName;
    String custID;
    String email;
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
        btnSave = root.findViewById(R.id.btnSave);
        rgbBillType = root.findViewById(R.id.rgbBillType);
        rbHydro = root.findViewById(R.id.rbHydro);
        rbInternet = root.findViewById(R.id.rbInternet);
        rbMobile = root.findViewById(R.id.rbMobile);
        rgbBillType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                switch (i) {
                    case R.id.rbHydro:

                        break;

                    case R.id.rbInternet:


                        break;

                    case R.id.rbMobile:

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
        addBillData(customer);
        singleton.addCustomer(customer);



    }


    public Customer addBillData(Customer customer)
    {
        if (rbHydro.isChecked()){

            Hydro hydro = new Hydro();
            hydro.setBillID(edtCustID.getText().toString());
            hydro.setBillType("Hydro");
            hydro.setBillDate("02-01-2020");
            hydro.setBillAmount(200.0);
            customer.setBillType("Hydro");
            customer.setBill(hydro);
            bill = hydro;

        }

        if (rbInternet.isChecked())
        {

            Internet internet = new Internet();
            internet.setBillID(edtCustID.getText().toString());
            internet.setBillType("Internet");
            internet.setBillDate("03-02-2020");
            internet.setBillAmount(400);
            customer.setBillType("Internet");
            customer.setBill(internet);
            bill = internet;

        }
        if (rbMobile.isChecked())
        {
            Mobile mobile = new Mobile();
            mobile.setBillID(edtCustID.getText().toString());
            mobile.setBillType("Mobile");
            mobile.setBillDate("04-01-2020");
            mobile.setBillAmount(600.0);
            customer.setBill(mobile);
            customer.setBillType("Mobile");
            bill = mobile;
        }

    }


}
