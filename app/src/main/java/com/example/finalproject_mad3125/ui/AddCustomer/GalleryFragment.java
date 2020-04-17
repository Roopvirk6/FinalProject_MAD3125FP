package com.example.finalproject_mad3125.ui.AddCustomer;

import android.os.Bundle;
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

import com.example.finalproject_mad3125.R;
import com.example.finalproject_mad3125.Singleton;

public class GalleryFragment extends Fragment {


    Bundle bundle= new Bundle();
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

    Singleton singleton= Singleton.getInstance();



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        edtCustID = root.findViewById(R.id.edtCustID);
        edtFirstName = root.findViewById(R.id.edtFirstName);
        edtLastName = root.findViewById(R.id.edtLastName);
        edtEmail = root.findViewById(R.id.edtEmail);
        edtAmount = root.findViewById(R.id.edtAmount);


    }
}
