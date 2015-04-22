package com.example.paul.cs407project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity2 extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity2);

    }

    public void login(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}