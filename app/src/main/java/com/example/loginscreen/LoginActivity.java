package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class LoginActivity extends AppCompatActivity {

    //Textview references
    private TextView username;
    private TextView password;
    private Switch mySwitch;

    //username and password strings
    private String usernameString;
    private String passwordString;

    private int switchValue;
    private SharedPreferences mySharedPrefs;



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
        //get switch object
        mySwitch = findViewById(R.id.switch1);


        //create thread and start it
        Multithreading thread1 = new Multithreading();
        thread1.start();


    }


    //Upon button press execute. Take user to login2.
    public void login(View v) {

        //check the text in username & password text-views and store as string
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();



        //search for username and password pair in database
            //if no pair is found: ERROR incorrect username or password



        //go to login2
        Intent intent = new Intent (this, LoginActivity2.class);
        startActivity(intent);
    }

    public void register(View v) {
        //check the text in username & password text-views and store as string
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();

        //search database for username


        //if username is already in use
            //Toast.makeText(LoginActivity.this, "Username is taken", Toast.LENGTH_LONG).show();
        //else
            // add username password pair to database
            // 2) store username and password strings in shared prefs to be automatically entered next time

        //go to login2
        Intent intent = new Intent (this, LoginActivity2.class);
        startActivity(intent);
    }
}