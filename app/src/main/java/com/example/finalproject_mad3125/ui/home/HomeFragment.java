package com.example.finalproject_mad3125.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.finalproject_mad3125.R;
import com.example.finalproject_mad3125.Singleton;

import java.text.DateFormat;
import java.util.Date;

public class HomeFragment extends Fragment {

    Singleton singleton= Singleton.getInstance();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView dateTextView = root.findViewById(R.id.text_date);
        TextView numCust = root.findViewById(R.id.numberCust);
        Date todayDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        String todayDateTimeString = dateFormat.format(todayDate);
        dateTextView.setText(todayDateTimeString);
        numCust.setText("Number Of Customers : "+singleton.arraySize());
        return root;
    }
}
