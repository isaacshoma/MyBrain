package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ImageSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_select);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
    //when button is clicked, take user to image activity
    public void returnToScroll(View v) {

        //take patient to image activity
        Intent intent = new Intent (this, ScrollingActivity.class);
        startActivity(intent);
    }
}