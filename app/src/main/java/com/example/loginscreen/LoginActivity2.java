package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * LoginActivity2 class is the secondary login screen where a user selects whether they are a
 * primary (media receiver) or secondary user (media provider). 2 buttons are provided to make
 * the selection. After selecting an option, the choice is stored in user preferences and this
 * activity will not be shown again.
 */
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

    //Upon button press, takes primary user to scrollingActivity
    public void patientLogin(View v) {
        Intent intent = new Intent (this, ScrollingActivity.class);
        startActivity(intent);
    }

    //Upon button press, takes secondary user to eventCreator activity
    public void providerLogin(View v) {
        Intent intent = new Intent (this, EventCreatorActivity.class);
        startActivity(intent);
    }
}