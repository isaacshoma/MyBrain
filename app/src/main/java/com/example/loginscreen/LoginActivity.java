package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    //Textview references
    private TextView username;
    private TextView password;

    //username and password strings
    private String usernameString;
    private String passwordString;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        //get username & password textview references by user-ids
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }



    //take patient to scroll activity
    public void login(View v) {

        //check if username exists
            //else tell user username does not exist

            //check if username matches password
                //else tell user password is incorrect

        //go to scrolling activity
        Intent intent = new Intent (this, ScrollingActivity.class);
        startActivity(intent);
    }

    //register patient with input username and password
    public void register(View v) {

        //check the text in username & password text-views and store as string
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();

        //was a valid username-password pair entered?
        boolean validCombination = false;

        //check if username is already taken
            //if username is already taken re-prompt user

        //check if password is valid
            //set bool to true

        //if validCombination found, take patient toScrollWindow
        Intent intent = new Intent (this, ScrollingActivity.class);
        startActivity(intent);
    }
}