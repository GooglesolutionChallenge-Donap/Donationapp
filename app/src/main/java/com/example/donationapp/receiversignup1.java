package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.example.donationapp.R;

public class receiversignup1 extends AppCompatActivity {

    String[] items =  {"Material","Design","Components","Android","5.0 Lollipop"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiversignup1);
        statusbar.blackiconstatusbar(receiversignup1.this,R.color.light_bg);

        autoCompleteTxt = findViewById(R.id.wheretodonate_autocompletetxt);

        adapterItems = new ArrayAdapter<String>(this,R.layout.receiversignup1_orgcategorylist,items);
        autoCompleteTxt.setAdapter(adapterItems);

        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"You Selected: "+item,Toast.LENGTH_SHORT).show();
            }
        });
    }
}