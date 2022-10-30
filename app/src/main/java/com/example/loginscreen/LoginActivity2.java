package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    //take user to scrolling activity
    public void patientLogin(View v) {

        //take patient to scrolling activity
        Intent intent = new Intent (this, ScrollingActivity.class);
        startActivity(intent);
    }

    //take user to eventCreator activity
    public void providerLogin(View v) {
        //take user to createEvent activity
        Intent intent = new Intent (this, EventCreatorActivity.class);
        startActivity(intent);
    }
}