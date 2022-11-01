package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * EventCreatorActivity class is a class for primary users to create an "event" that can be
 * sent to a specified secondary user. User is specified through userID/username.
 * Events consist of secondary user's: name, relation to the primary user, profile picture,
 * attached image to be sent, a personalized message, and the userID/username of the primary user.
 *
 * Entered Info includes:
 * String yourName,
 * String relation,
 * Image profilePic,
 * Image imageToSend,
 * String userID/username
 */
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

    //Upon button press, event is sent with the currently entered info to
    // the user associated with the entered userID
    public void sendContent(View v) {

        //send event to patient

        //notify user message has been sent
        Toast toast = Toast.makeText(EventCreatorActivity.this, "Message Sent", Toast.LENGTH_LONG);
        toast.show();
    }

    //Upon button press, secondary user's local gallery is opened to select a picture for sending
    public void getGalleryImage(View v) {
        //notify user that gallery has been opened
        Toast toast = Toast.makeText(EventCreatorActivity.this, "Gallery Image Selected", Toast.LENGTH_LONG);
        toast.show();
    }

    //Upon button press, secondary user's phone camera is opened to take a profile picture
    public void accessCamera(View v) {
        //notify user of action's success
        Toast toast = Toast.makeText(EventCreatorActivity.this, "Access Camera", Toast.LENGTH_LONG);
        toast.show();
    }
}