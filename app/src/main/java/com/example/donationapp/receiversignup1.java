package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphImageButton;

public class receiversignup1 extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    NeumorphImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiversignup1);



//        change status bar color
        statusbar.blackiconstatusbar(receiversignup1.this,R.color.light_bg);


        //back button function

        backbtn=findViewById(R.id.receiversignup1_backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(receiversignup1.this,login.class);
                startActivity(i);
            }
        });

        //submit button code

      NeumorphButton sbmtbtn=findViewById(R.id.receiversignup1_submitbtn) ;
      sbmtbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i=new Intent(receiversignup1.this,receiverhomepage.class);
              startActivity(i);
          }
      });


        // DROP DOWN CODE

        autoCompleteTextView = findViewById(R.id.receiversignup1_autocompletetxt);

        String []option = {"Organisation Category" , "NGO", "Orphanage", "Old-Age Home"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this , R.layout.registersignup1_orgcategorylist , option);
        autoCompleteTextView.setText(arrayAdapter.getItem(0).toString() , false);
        autoCompleteTextView.setAdapter(arrayAdapter);

        // DROPDOWN CODE ENDS HERE

    }
}