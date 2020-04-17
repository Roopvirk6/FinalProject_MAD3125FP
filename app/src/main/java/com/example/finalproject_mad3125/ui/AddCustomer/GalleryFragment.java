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

public class GalleryFragment extends Fragment {


    Bundle bundle= new Bundle();
    EditText customerID;
    EditText customerFirstName;
    EditText customerLastName;
    EditText customerEmail;
    EditText amount;
    RadioGroup rgBillType;
    RadioButton rbHydro;
    RadioButton rbInternet;
    RadioButton rbMobile;
    Button btnSave;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
