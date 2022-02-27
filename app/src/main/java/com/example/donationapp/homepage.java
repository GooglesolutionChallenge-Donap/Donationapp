package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
private TextView logotext;
private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        logotext=(TextView)findViewById(R.id.logo_text);
        logo=(ImageView) findViewById(R.id.logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent i = new Intent( homepage.this,login.class);
                ActivityOptions option=ActivityOptions.makeSceneTransitionAnimation(homepage.this,
                        Pair.create(logo,"logo"),
                Pair.create(logotext, "logoText"));
                startActivity(i,option.toBundle());
            }
        },3000);
    }
}