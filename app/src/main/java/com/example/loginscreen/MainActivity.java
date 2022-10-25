package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void patientLogin(View v) {

        //take patient to login activity
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);
    }

    //take user to main user activity
    public void providerLogin(View v) {
        //take user to createEvent activity
        Intent intent = new Intent (this, EventCreatorActivity.class);
        startActivity(intent);
    }
}