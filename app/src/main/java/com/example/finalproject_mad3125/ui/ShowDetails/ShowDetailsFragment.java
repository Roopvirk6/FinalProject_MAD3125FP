package com.example.finalproject_mad3125.ui.ShowDetails;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject_mad3125.Customer;
import com.example.finalproject_mad3125.R;
import com.example.finalproject_mad3125.Singleton;
import com.example.finalproject_mad3125.adapters.CustomerListAdapter;

import java.util.List;

public class ShowDetailsFragment extends Fragment {

    private RecyclerView emplistrv;
    private List<Customer> customerList;
    private CustomerListAdapter demoAdapter;
    //Singleton singleton= Singleton.getInstance();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.show_details_fragment3, container, false);
        emplistrv = root.findViewById(R.id.emplistrv);
        initViews();
        return root;
    }

    private void initViews()
    {
        populateData();
        demoAdapter = new CustomerListAdapter(customerList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        emplistrv .setLayoutManager(mLayoutManager);

    }









}
