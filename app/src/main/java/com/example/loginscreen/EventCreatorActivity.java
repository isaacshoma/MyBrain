package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EventCreatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_creator);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    //send content button
    public void sendContent(View v) {

        //send event to patient

        //notify user message has been sent
        Toast toast = Toast.makeText(EventCreatorActivity.this, "Message Sent", Toast.LENGTH_LONG);
        toast.show();
    }

    //gallery button to select picture from gallery
    public void getGalleryImage(View v) {

        //notify user
        Toast toast = Toast.makeText(EventCreatorActivity.this, "Gallery Image Selected", Toast.LENGTH_LONG);
        toast.show();
    }

    //gallery button to select picture from gallery
    public void accessCamera(View v) {

        //notify user
        Toast toast = Toast.makeText(EventCreatorActivity.this, "Access Camera", Toast.LENGTH_LONG);
        toast.show();
    }

}