package com.example.loginscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Edits;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * ImageSelectActivity class is the screen that appears after the primary user has clicked on an event
 * from the ScrollingActivity. The contents of the imageSelectActivity is pulled from the database
 * upon starting. No info is entered on this page. It is just for viewing.
 * A "return" button is provided at the bottom to take the primary user back to the main ScrollingActivity.
 */
public class ImageSelectActivity extends AppCompatActivity {

    //get textview references for name and relation
    TextView nameText;
    TextView relationText;

    int eventNum;
    static boolean exists = false;

    Map<String, Object> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_select);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        //get number representing the imageView clicked in scrolling activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            eventNum = extras.getInt("Num");
        }

        //get textview references for name and relation
        nameText = findViewById(R.id.textView5);
        relationText = findViewById(R.id.textView6);


    }

    //Upon button press, take primary user back to ScrollingActivity
    public void returnToScroll(View v) {
        Intent intent = new Intent (this, ScrollingActivity.class);
        startActivity(intent);
    }
}