package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * ImageSelectActivity class is the screen that appears after the primary user has clicked on an event
 * from the ScrollingActivity. The contents of the imageSelectActivity is pulled from the database
 * upon starting. No info is entered on this page. It is just for viewing.
 * A "return" button is provided at the bottom to take the primary user back to the main ScrollingActivity.
 */
public class ImageSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_select);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        //Pull associated event content data from the user's event queue in database

    }

    //Upon button press, take primary user back to ScrollingActivity
    public void returnToScroll(View v) {
        Intent intent = new Intent (this, ScrollingActivity.class);
        startActivity(intent);
    }
}