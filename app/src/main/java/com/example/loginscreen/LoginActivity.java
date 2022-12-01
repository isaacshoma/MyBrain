package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    //Shared Prefs
    private final static String SWITCH = "switch";
    private final static String USER = "user";








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

        SharedPreferences sharedPreferences1 = getSharedPreferences("NAME", MODE_PRIVATE);
        Boolean switchState = sharedPreferences1.getBoolean(SWITCH, false);
        if (switchState) {
            mySwitch.setChecked(true);
            SharedPreferences sharedPreferences = getSharedPreferences("NAME", MODE_PRIVATE);
            String savedLoginString = sharedPreferences.getString(USER, "");
            String[] splitString = savedLoginString.split("_");
            String usernameSplit = splitString[0];
            String passwordSplit = splitString[1];

            username.setText(usernameSplit);
            password.setText(passwordSplit);
        }
    }





    public void login(View v) {
        //check the text in username & password text-views and store as string
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();
        String userPair = usernameString + "_" + passwordString;

        if (usernameString.isEmpty() && !passwordString.isEmpty()) {
            Toast.makeText(this, "Please enter a Username", Toast.LENGTH_LONG).show();
        }
        else if (!usernameString.isEmpty() && passwordString.isEmpty()) {
            Toast.makeText(this, "Please enter a Password", Toast.LENGTH_LONG).show();
        }
        else if (usernameString.isEmpty() && passwordString.isEmpty()) {
            Toast.makeText(this, "Please enter a Username & Password", Toast.LENGTH_LONG).show();
        }




        //register user in sharedPreferences
        else {

            SharedPreferences sharedPreferences = getSharedPreferences("NAME", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            //if entered username & password is an existing account . . . login
            if (sharedPreferences.getString(USER, "").contentEquals(userPair)) {
                Intent intent = new Intent (this, LoginActivity2.class);
                startActivity(intent);
            }

            else {
                Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_LONG).show();
            }
        }
    }





    //Upon register button press, execute. Registers user by storing details in user preferences
    //Takes user to login2 activity
    public void register(View v) {
        //check the text in username & password text-views and store as string
        usernameString = username.getText().toString();
        passwordString = password.getText().toString();
        String userPair = usernameString + "_" + passwordString;

        if (usernameString.isEmpty() && !passwordString.isEmpty()) {
            Toast.makeText(this, "Please enter a Username", Toast.LENGTH_LONG).show();
        }
        else if (!usernameString.isEmpty() && passwordString.isEmpty()) {
            Toast.makeText(this, "Please enter a Password", Toast.LENGTH_LONG).show();
        }
        else if (usernameString.isEmpty() && passwordString.isEmpty()) {
            Toast.makeText(this, "Please enter a Username & Password", Toast.LENGTH_LONG).show();
        }




        //register user in sharedPreferences
        else {
            SharedPreferences sharedPreferences = getSharedPreferences("NAME", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putString(USER, userPair);
            editor.commit();
            //go to login2
            Intent intent = new Intent (this, LoginActivity2.class);
            startActivity(intent);
            //Toast.makeText(this, "Logged in as: " + usernameString, Toast.LENGTH_LONG).show();
        }
    }

    public void switchClick(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("NAME", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(SWITCH, mySwitch.isChecked());
        editor.commit();
    }
}