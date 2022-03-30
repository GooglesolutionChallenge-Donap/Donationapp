package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphCardView;

public class login extends AppCompatActivity {

    TextView signuptext;
    NeumorphButton loginbtn;
    Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //removing titlebar form app

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);


        //changing statusbar color

        statusbar.blackiconstatusbar(login.this, R.color.light_bg);


        //adding onclicklistener and id to variable


//        login btn

        loginbtn = findViewById(R.id.login_btn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(login.this, "clcked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login.this, receiverhomepage.class);
                startActivity(intent);
            }
        });


        //sigup btn

        signuptext = (TextView) findViewById(R.id.newuser_text);
        signuptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpToast();
            }
        });

        // sigup as donor receiver card diaolg

        dialog = new Dialog(this);
    }

//    @Override
//    public void onClick(View v) {
//
//        switch(v.getId()){
//            case R.id.login_btn: Intent intent=new Intent(login.this,donorhomepage.class);
//                startActivity(intent);
//            break;
//
//            case R.id.newuser_text:
//                openSignUpToast();
//            break;
//            default:
//                Toast.makeText(this, "wrong option", Toast.LENGTH_SHORT).show();
//        }
//
//
//    }


    // Function of dialogue sigup as donor or receiver


    private void openSignUpToast() {


        dialog.setContentView(R.layout.signup_as_toast);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setWindowAnimations(R.style.SignUpAsAnimaton);

        NeumorphCardView cardDonor = dialog.findViewById(R.id.signup_donor);
        NeumorphCardView cardReceiver = dialog.findViewById(R.id.signup_receiver);

        ImageView imageViewClose = dialog.findViewById(R.id.signup_as_close);

        cardDonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(login.this, donersignup.class);
                startActivity(i);

            }
        });

        cardReceiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(login.this, receiversignup1.class);
                startActivity(ii);

            }
        });

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();

            }
        });


        dialog.show();


    }

}