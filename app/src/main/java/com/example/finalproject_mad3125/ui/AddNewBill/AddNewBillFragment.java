package com.example.finalproject_mad3125.ui.AddNewBill;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject_mad3125.R;

public class AddNewBillFragment extends Fragment {

    private AddNewBillViewModel mViewModel;

    public static AddNewBillFragment newInstance() {
        return new AddNewBillFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.add_new_bill_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AddNewBillViewModel.class);
        // TODO: Use the ViewModel
    }

}
