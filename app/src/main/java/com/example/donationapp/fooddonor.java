package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;

import soup.neumorphism.NeumorphImageButton;

public class fooddonor extends AppCompatActivity {
   //Drop down
    String[] donate =  {"NGO","Old Age Home","Shelter Home","Orphanage"};
    AutoCompleteTextView autoCompleteText;
    ArrayAdapter<String> adapterItem;
    //Upload Image
    Button BSelectImage;
//    back button
    NeumorphImageButton backbtn;

    // One Preview Image
    ImageView IVPreviewImage;

    // constant to compare
    // the activity result code
    int SELECT_PICTURE = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddonor);

        //removing titlebar form app

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fooddonor);


//        change status bar color
        statusbar.blackiconstatusbar(fooddonor.this,R.color.light_bg);

        //back button function

        backbtn=findViewById(R.id.donorfood_backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(fooddonor.this,donorhomepage.class);
                startActivity(i);
            }
        });

        //back btn functn ENDS


//drop down menu
        autoCompleteText = findViewById(R.id.wheretodonate_autocompletetxt);
        adapterItem = new ArrayAdapter<String>(this,R.layout.registersignup1_orgcategorylist,donate);
        autoCompleteText.setAdapter(adapterItem);

        autoCompleteText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"You Selected: "+item,Toast.LENGTH_SHORT).show();
            }
        });

//        image upload function starts


        BSelectImage = findViewById(R.id.BSelectImage);
        IVPreviewImage = findViewById(R.id.IVPreviewImage);

        // handle the Choose Image button to trigger
        // the image chooser function
        BSelectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageChooser();
            }
        });
    }

    // this function is triggered when
    // the Select Image Button is clicked
    void imageChooser() {

        // create an instance of the
        // intent of the type image
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);

        // pass the constant to compare it
        // with the returned requestCode
        startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            // compare the resultCode with the
            // SELECT_PICTURE constant
            if (requestCode == SELECT_PICTURE) {
                // Get the url of the image from data
                Uri selectedImageUri = data.getData();
                if (null != selectedImageUri) {
                    // update the preview image in the layout
                    IVPreviewImage.setImageURI(selectedImageUri);
                }
            }
        }
    }
}