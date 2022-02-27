package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener {
TextView signuptext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signuptext=findViewById(R.id.newuser_text);
        signuptext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i= new Intent(login.this,homepage.class);
        startActivity(i);
    }
}