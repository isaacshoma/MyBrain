package com.example.loginscreen;
import android.util.Log;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.PropertyName;
import com.google.firebase.database.ValueEventListener;

/**
 * The Upload class is responsible for uploading text to firebase
 */
public class UserData {

    private String senderName;
    private String relationToRecipient;
    private String recipientUsername;

    /**
     * Default Constructor
     */
    public UserData() {

        //get strings from editText objects
        senderName = "";
        relationToRecipient = "";
        recipientUsername = "";
    }

    /**
     * Constructor to initialize user object's text variables
     */
    public UserData(EditText nameObject, EditText relationObject, EditText recipientObject) {

        //get strings from editText objects
        senderName = nameObject.getText().toString();
        relationToRecipient = relationObject.getText().toString();
        recipientUsername = recipientObject.getText().toString();
    }

    //Send text data to firebase
    public void sendToFirebase() {

        //get firebase reference
        DatabaseReference fireBase = FirebaseDatabase.getInstance().getReference();

        //push to database
        fireBase.child("SentEvents").child("SentBy_" + senderName).push().setValue(this);
    }

    //get name as string
    @PropertyName("name")
    public String getName() {
        return senderName;
    }

    //get relation as string
    @PropertyName("relation")
    public String getRelation() {
        return relationToRecipient;
    }

    @PropertyName("recipientUsername")
    public String getRecipientUsername() {
        return recipientUsername;
    }

    //set name
    public Boolean setName(String name) {
        senderName = name;
        return true;
    }

    //set relation
    public Boolean setRelationToRecipient(String relation) {
        relationToRecipient = relation;
        return true;
    }

    //set username to send to
    public Boolean setRecipientUsername(String recipientUsername) {
        recipientUsername = recipientUsername;
        return true;
    }
}
