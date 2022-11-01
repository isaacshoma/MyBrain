/**
 * CMPT 385, Fall 2022, Trinity Western University
 * Group 2: We Don't Byte
 * Project: My Brain
 *
 * Last Modified: Nov 1, 2022
 *
 * Members: Dane Munday, Isaac Shoma, Okewoma Okumo, Denghao Wang
 *
 *  The MyBrain android app is a media sharing app either for use by a therapist/caregiver
 *  of a dementia patient as an aid for reminiscence therapy, or for direct use by the dementia patient.
 *  The main user (dementia patient) is given a feed of content sent by secondary users (friends/family)
 *  about their daily lives to improve their feeling of connection and involvement. When an image has
 *  been selected by the primary user, a corresponding info panel will be provided including the
 *  sender's image, name, relation to the primary user, as well as an optional personalized message.
 *  This app was created to address the concern of an increasing sense of disconnection and loneliness
 *  among dementia patients.
 *
 *  Upon first logging in, the user will select whether they are the primary user (patient) or a
 *  secondary user (friend/family) this option will be stored in user preferences and will not appear
 *  a second time. Primary users are the media receivers while secondary users provide the media for the feed.
 *
 *  Unique Primary User Activities: ScrollingActivity, ImageSelectActivity
 *  Unique Secondary User Activity: EventCreatorActivity
 *  Shared Activities: MainActivity, LoginActivity, LoginActivity2
 */
package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Main Activity class is a splash screen that appears before user login
 */
public class MainActivity extends AppCompatActivity {

    //time to display splash screen (in milliseconds)
    private static int DELAY_TIME = 800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        //after waiting (DELAY_TIME), go to LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //change activity from MainActivity to LoginActivity
                Intent goToLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(goToLogin);
                finish();
            }
        }, DELAY_TIME);
    }
}