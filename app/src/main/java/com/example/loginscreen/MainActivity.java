package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    //time to display splash screen (s/1000)
    private static int DELAY_TIME = 800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }



        //after (DELAY_TIME), go to login activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goToLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(goToLogin);
                finish();
            }
        }, DELAY_TIME);
    }
}