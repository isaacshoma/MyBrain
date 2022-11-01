package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

import com.example.loginscreen.databinding.ActivityScrollingBinding;

public class ScrollingActivity extends AppCompatActivity {

    //user's username
    private String username = "Default User";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    //when button is clicked, take user to image activity
    public void toImage(View v) {

        //take patient to image activity
        Intent intent = new Intent (this, ImageSelectActivity.class);
        startActivity(intent);
    }

    public void getUsername(View v) {
        Toast toast = Toast.makeText(ScrollingActivity.this, "Username = " + username, Toast.LENGTH_LONG);
        toast.show();
    }
}