package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener {

    TextView signuptext;
    Button loginbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //removing titlebar form app

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


        //changing statusbar color

        statusbar.blackiconstatusbar(login.this,R.color.light_bg);


        //adding onclicklistener and id to variable

        loginbtn=(Button) findViewById(R.id.login_btn);
        loginbtn.setOnClickListener(this);

        signuptext=(TextView) findViewById(R.id.newuser_text);
        signuptext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.login_btn: i=new Intent(login.this,donorhomepage.class);
                startActivity(i);
            break;

            case R.id.newuser_text: i=new Intent(this,receiversignup1.class);
            startActivity(i);
            break;
        }


    }
}