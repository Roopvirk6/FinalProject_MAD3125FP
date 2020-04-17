package com.example.finalproject_mad3125.ui.AddCustomer;

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

public class GalleryFragment extends Fragment {


    Bundle bundle = new Bundle();
    EditText edtCustID;
    EditText edtFirstName;
    EditText edtLastName;
    EditText edtEmail;
    EditText edtAmount;
    EditText edtBillType;
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
        edtBillType = root.findViewById(R.id.edtBillType);
        btnSave = root.findViewById(R.id.btnSave);




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
        btype = edtBillType.getText().toString();
        Customer customer = new Customer();
        customer.setCustomerFirstName(firstname);
        customer.setCustomerLastName(lastName);
        customer.setCustomerId(custID);
        customer.setCustomerEmailAddress(email);
        customer.setAmount(amount);
        customer.setBillType(btype);
        singleton.addCustomer(customer);
        return customer;



    }



}
