package com.example.finalproject_mad3125.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject_mad3125.Customer;
import com.example.finalproject_mad3125.CustomerListActivity;
import com.example.finalproject_mad3125.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListAdapter.DemoViewHolder>
    {


        private List<Customer> customerList;

        public CustomerListAdapter(List<Customer> customerList)
        {
            this.customerList = customerList;
        }

        @NonNull
        @Override
        public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
        {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_row, parent, false);
            return new DemoViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull final DemoViewHolder holder, int position)
        {
            final Customer mEmp = customerList.get(position);
            holder.custName.setText(mEmp.getCustomerFirstName());
            holder.bType.setText(mEmp.getBillType());


            //Setting click on cell
            holder.itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(holder.itemView.getContext(), mEmp.getCustomerFirstName(), Toast.LENGTH_SHORT).show();
                    Intent mIntent = new Intent(holder.itemView.getContext(), CustomerListActivity.class);
                    mIntent.putExtra("employee",(Serializable) mEmp);
                    holder.itemView.getContext().startActivity(mIntent);
                }
            });
        }

        @Override
        public int getItemCount()
        {
            return customerList.size();
        }

        public static class DemoViewHolder extends RecyclerView.ViewHolder
        {
            public TextView custName;
            public TextView bType;

            public DemoViewHolder(@NonNull View itemView)
            {
                super(itemView);
                custName = itemView.findViewById(R.id.txtCustomerName);
                bType = itemView.findViewById(R.id.txtBillType);

            }
        }


    }

