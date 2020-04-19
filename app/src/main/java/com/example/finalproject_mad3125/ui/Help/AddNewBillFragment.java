package com.example.finalproject_mad3125.ui.Help;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject_mad3125.R;

public class AddNewBillFragment extends Fragment {

    private void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        alertDialogBuilder.setTitle("Contact Us");
        alertDialogBuilder.setMessage("Email Us at: User@gmail.com");
        alertDialogBuilder.setMessage("Call Us: 12345678                                     " +
                " Email Us at: User@gmail.com");
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }
        });
        
    }





    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.add_new_bill_fragment, container, false);
    }



}
