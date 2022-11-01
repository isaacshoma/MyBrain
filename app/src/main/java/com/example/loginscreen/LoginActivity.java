package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

/**
 * LoginActivity class is the primary login screen where both primary and secondary users
 * can register an account and login. After login, user is taken to login screen 2.
 *
 * Entered Info includes:
 * String username,
 * String password,
 * int/bool whether to remember login details (0 or 1),
 */
public class LoginActivity extends AppCompatActivity {

    //Textview references
    private TextView username;
    private TextView password;
    private Switch mySwitch;

    //username and password strings
    private String usernameString;
    private String passwordString;

    //switch value (whether to remember login details)
    private int switchValue;
    //file to store user preferences
    private SharedPreferences mySharedPrefs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        //get username & password textview references by user-ids
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        //get switch object
        mySwitch = findViewById(R.id.switch1);


        //create a thread and start it (used for sockets to establish server connection)
        Multithreading thread1 = new Multithreading();
        thread1.start();
    }

    //Upon login button press, execute. Takes user to login2 activity.
    public void login(View v) {

        //check the text in username & password text-views and store as string
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();


        //search for username and password pair in database
            //if no pair is found: ERROR incorrect username or password

        //go to login2 activity
        Intent intent = new Intent (this, LoginActivity2.class);
        startActivity(intent);
    }

    //Upon register button press, execute. Registers user by storing details in database.
    //Takes user to login2 activity
    public void register(View v) {
        //check the text in username & password text-views and store as string
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();

        //search database for username


        //if username is already in use
            //Toast.makeText(LoginActivity.this, "Username is taken", Toast.LENGTH_LONG).show();
        //else
            // add username-password pair to database
            // store username and password strings in shared prefs to be automatically entered next time

        //go to login2
        Intent intent = new Intent (this, LoginActivity2.class);
        startActivity(intent);
    }
}