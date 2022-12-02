package com.example.loginscreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

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
    private final static String USER = "user";

    //textview object
    private TextView textObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        //textView reference and assignment
        textObject = findViewById(R.id.textView);

        //find user's username
        SharedPreferences sharedPreferences = getSharedPreferences("NAME", MODE_PRIVATE);
        String userString = sharedPreferences.getString(USER, "");
        String[] stringList = userString.split("_");

        //capitalize first letter of username
        String usernameString = stringList[0];
        //take first letter as new string
        String firstLetter = usernameString.charAt(0) + "";
        //create substring without first letter
        String subLength = usernameString.substring(1, usernameString.length());
        //capitalize and combine
        firstLetter = firstLetter.toUpperCase();
        String newUsernameString = firstLetter + subLength;

        //set text object's text
        textObject.setText(newUsernameString);
    }

    //Upon button click (an event item), user is taken to ImageSelectActivity
    public void toImage(View v) {
        Intent intent = new Intent (this, ImageSelectActivity.class);
        startActivity(intent);
    }

    public void returnToLogin(View v) {
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);
    }
}