package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

/**
 * ScrollingActivity class is the primary user's activity where they will spend the majority of
 * their time. A feed of sent events will appear on the primary user's scrolling screen that,
 * when clicked on, will take user to ImageSelect Activity (details on image contents and the sender).
 * A "getID" button is located in the top left of the screen that provides the user with their userID/username
 * in the case a friend or family member needs their ID to send them an event. UserID is provided via an
 * Android Toast notification.
 */
public class ScrollingActivity extends AppCompatActivity {

    //user's username/ID
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

    //Upon button click (an event item), user is taken to ImageSelectActivity
    public void toImage(View v) {
        Intent intent = new Intent (this, ImageSelectActivity.class);
        startActivity(intent);
    }

    //Upon button click, user is provided a toast notification on what their userID/username is
    public void getUsername(View v) {
        Toast toast = Toast.makeText(ScrollingActivity.this, "Username = " + username, Toast.LENGTH_LONG);
        toast.show();
    }
}