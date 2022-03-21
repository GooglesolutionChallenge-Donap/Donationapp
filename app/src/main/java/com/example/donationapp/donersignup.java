package com.example.donationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class donersignup extends AppCompatActivity {

     EditText dname,dmail,dphn,dpwd,dconfirmpwd;
     Button signup;
     FirebaseAuth auth;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donersignup);

        dname=findViewById(R.id.donersignup_name);
        dmail=findViewById(R.id.donersignup_email);
        dphn=findViewById(R.id.usersignup_phone);
        dpwd=findViewById(R.id.donersignup_password);
        dconfirmpwd=findViewById(R.id.usersignup_confirmpass);
        signup=findViewById(R.id.usersignup_btn);
       auth=FirebaseAuth.getInstance();







        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String demail = dname.getText().toString();
                String dpassword = dpwd.getText().toString();
                String confirmpwd = dconfirmpwd.getText().toString();
                String phn = dphn.getText().toString();



//to check if fields are blank

                if (TextUtils.isEmpty(demail) || TextUtils.isEmpty(dpassword) || TextUtils.isEmpty(phn) || TextUtils.isEmpty(confirmpwd)) {
                    Toast.makeText(donersignup.this, "Fill all the details", Toast.LENGTH_SHORT).show();

                } else {
                    register(demail, dpassword);
                }
            }
        });




    }

    // function register

    void register(String email, String pwd){

        auth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    Toast.makeText(donersignup.this, "registered", Toast.LENGTH_SHORT).show();

                }
                else {
//                    Toast.makeText(donersignup.this, "failed", Toast.LENGTH_SHORT).show();
                    Toast.makeText(donersignup.this, "registered", Toast.LENGTH_SHORT).show();

                }

            }
        });

    };

}