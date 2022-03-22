package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import soup.neumorphism.NeumorphImageButton;

public class donersignup extends AppCompatActivity {
    NeumorphImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donersignup);

        //removing titlebar form app

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_donersignup);

//        change status bar color
        statusbar.blackiconstatusbar(donersignup.this,R.color.light_bg);

        //back button function

        backbtn=findViewById(R.id.donorsignup_backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(donersignup.this,login.class);
                startActivity(i);
            }
        });

        //back btn functn ENDS



    }
}