package com.example.paul.cs407project.Model;

/**
 * Created by ayza91 on 4/18/15.
 */
public class Backend {
    private static final String TAG = "ConnectionManager";

    //Callback interface: how calling objects receive responses asynchronously without delegation
    public interface BackendCallback {
        public void onRequestCompleted(Object result);

        public void onRequestFailed(String message);
    }


    }



