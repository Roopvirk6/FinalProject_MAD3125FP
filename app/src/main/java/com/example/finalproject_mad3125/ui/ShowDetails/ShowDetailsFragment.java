package com.example.finalproject_mad3125.ui.ShowDetails;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject_mad3125.R;

public class ShowDetailsFragment extends Fragment {

    private ShowDetailsViewModel mViewModel;

    public static ShowDetailsFragment newInstance() {
        return new ShowDetailsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.show_details_fragment3, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ShowDetailsViewModel.class);
        // TODO: Use the ViewModel
    }

}
