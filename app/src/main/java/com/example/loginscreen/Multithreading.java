package com.example.loginscreen;

import android.util.Log;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * The Multithreading class is an extension of the thread class with an overriden run() function.
 * It allows a socket connection with the database server to be established via multithreading so
 * that the user's experience is not frozen when waiting for a connection to be established and data
 * transferred.
 */
public class Multithreading extends Thread{
    @Override
    public void run() {
        //Log.e("Error","E1");

        //attempt to connect to database server. If the connection fails,
        //print stackTrace
        try {
            //Log.e("ERROR","E2");

            //Specify a clientSocket
            Socket clientSocket = new Socket("192.168.56.1", 5555);

            //Log.e("ERROR","E3");

            //Create an outputStream and an associated message to send to server
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            out.writeUTF("HELLO SERVER");

            //Log.e("ERROR", "E4");
        } catch (IOException e) {
            e.printStackTrace();
            //Log.e("ERROR", "E5");
        }
    }
}
