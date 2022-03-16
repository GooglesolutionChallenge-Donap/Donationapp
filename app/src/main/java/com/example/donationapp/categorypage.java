package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import soup.neumorphism.NeumorphCardView;

public class categorypage extends AppCompatActivity implements View.OnClickListener {
NeumorphCardView charitycard,animalcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorypage);

        charitycard=(NeumorphCardView) findViewById(R.id.charity_card);
        charitycard.setOnClickListener(this);

        animalcard=(NeumorphCardView) findViewById(R.id.animalrescue_card);



    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.charity_card:
                i=new Intent(this,login.class);
                startActivity(i);
                break;
        }

    }
}