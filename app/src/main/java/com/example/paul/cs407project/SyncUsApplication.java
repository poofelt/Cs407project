package com.example.paul.cs407project;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class SyncUsApplication extends Application {

    public static final String TODO_GROUP_NAME = "ALL_TODOS";

    @Override
    public void onCreate() {
        super.onCreate();

        // add Todo subclass
        ParseObject.registerSubclass(Todo.class);

        // enable the Local Datastore
        Parse.enableLocalDatastore(getApplicationContext());
        Parse.initialize(this, "S853VeY0ISR12ujFxD6vAN2CL1x1yzRDCSXSOtq1", "g4XHz7D1WubgNX8EUD9EouHdVHqgbGTmi8DKaq75");
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        ParseACL.setDefaultACL(defaultACL, true);
    }



}
