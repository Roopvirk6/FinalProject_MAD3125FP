package com.example.finalproject_mad3125;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    ImageView imageView2;
    TextInputEditText editText1;
    TextInputEditText edtPassword;
    //SwitchMaterial rememberMe;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        editText1 = (TextInputEditText)findViewById(R.id.editText1);
        edtPassword = (TextInputEditText)findViewById(R.id.edtPassword);
       // rememberMe = (SwitchMaterial)findViewById(R.id.rememberMe);
        btnLogin = (Button)findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (editText1.getText().toString().equals("user@gmail.com") &&
                        edtPassword.getText().toString().equals("text"))
                {
                    Intent intent = new Intent(MainActivity.this,MainMenuActivity.class);
                    startActivity(intent);
                }
                else
                {
                    showAlert();
                }
            }
        });
    }

    private void showAlert()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Login Error");
        alertDialogBuilder.setMessage("Invalid Email Id and Password");
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog nAlertDialog = alertDialogBuilder.create();
        nAlertDialog.show();





    }



}
