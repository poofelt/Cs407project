package com.example.paul.cs407project;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity implements OnClickListener{



    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //click listeners
        View todoButton = findViewById(R.id.todo_button);
        todoButton.setOnClickListener(this);
        View calendarButton = findViewById(R.id.calendar_button);
        calendarButton.setOnClickListener(this);
        View notificationsButton = findViewById(R.id.notifs_button);
        notificationsButton.setOnClickListener(this);
        View sharedlistsButton = findViewById(R.id.shared_button);
        sharedlistsButton.setOnClickListener(this);
        View myfriendsButton = findViewById(R.id.friends_button);
        myfriendsButton.setOnClickListener(this);
        } public void onClick(View v){
        switch (v.getId()){
        case R.id.notifs_button:
        Intent Notification = new Intent(this, Notifications.class);
        startActivity(Notification);
        break;
        case R.id.todo_button:
        Intent Todo = new Intent(this, Todos.class);
        startActivity(Todo);
        break;

        //Add other buttons here
        }
        }


        }



