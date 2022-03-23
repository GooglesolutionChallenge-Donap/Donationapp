package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;

import soup.neumorphism.NeumorphCardView;
import soup.neumorphism.NeumorphImageButton;
import soup.neumorphism.NeumorphTextView;

public class DonorClothes extends AppCompatActivity {
    RelativeLayout rl;
    NeumorphCardView orphanage,oldage,ngo,shelter;
    NeumorphTextView text;
    NeumorphImageButton backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_clothes);

        //removing titlebar form app

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_donor_clothes);


//        change status bar color
        statusbar.blackiconstatusbar(DonorClothes.this,R.color.light_bg);


//        'linking to xml id '

        text = findViewById(R.id.donorclothes_text);
        rl = findViewById(R.id.donorclothes_rl);
        oldage = findViewById(R.id.donorclothes_oldage_card);
        ngo = findViewById(R.id.donorclothes_ngo_card);
        shelter = findViewById(R.id.donorclothes_shelter_card);

        //back btn functn


        backbtn=findViewById(R.id.donorclothes_backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(DonorClothes.this,donorhomepage.class);
                startActivity(i);
            }
        });
        //BACK BTN FUNCTN ENDS HERE


//on click orphange list function
        orphanage = findViewById(R.id.donorclothes_orphanage_card);
        orphanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),orphanage);

                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){

                            case R.id.donorclothes_orphanage1:

                            case R.id.donorclothes_orphanage2:
                                popupMenu.dismiss();
                                return true;

                        }

                        return false;
                    }


                });

                popupMenu.show();
            }
        });
        oldage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),oldage);

                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){

                            case R.id.donorclothes_orphanage1:

                            case R.id.donorclothes_orphanage2:
                                popupMenu.dismiss();
                                return true;

                        }

                        return false;
                    }


                });

                popupMenu.show();
            }
        });
        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),ngo);

                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){

                            case R.id.donorclothes_orphanage1:

                            case R.id.donorclothes_orphanage2:
                                popupMenu.dismiss();
                                return true;

                        }

                        return false;
                    }


                });

                popupMenu.show();
            }
        });
        shelter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),shelter);

                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()){

                            case R.id.donorclothes_orphanage1:

                            case R.id.donorclothes_orphanage2:
                                popupMenu.dismiss();
                                return true;

                        }

                        return false;
                    }


                });

                popupMenu.show();
            }
        });









    }
}