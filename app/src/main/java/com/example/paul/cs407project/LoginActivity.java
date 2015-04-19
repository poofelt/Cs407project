package com.example.paul.cs407project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.paul.cs407project.Model.Backend;
import com.example.paul.cs407project.Model.User;

import java.util.List;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View view) {
        //Intent intent = new Intent(this, LoginActivity2.class);
        //startActivity(intent);
    }

    private void login(String name, String title) {
        final String TAG = “LOGIN_ACTIVITY”;
        final Context currContext = this;
       // Log.d(TAG, "Attempting to login with email: " + email + " password: " + password);
        Backend.logIn(name, title, new Backend.BackendCallback() {
            @Override
            public void onRequestCompleted(Object result) {
                final User user = (User) result;
                Log.d(TAG, "Login success. User: " + user.toString());

                runOnUiThread(new Runnable() {
                                  public void run() {
                                      //Must check db for user with existing backendId.  If doesn't already exist, then save
                                      //.find is how to query for objects saved with Sugar
                                      List<User> users = User.find(User.class, "backend_id = ?", new Integer(user.backendId).toString());
                                      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(currContext);
                                      SharedPreferences.Editor editor = prefs.edit();
                                      if (users.size() == 0) {
                                          user.save();
                                          //This is NOT the backend id, this is the sugar id
                                          editor.putString("loggedInId", Long.toString(user.getId()));
                                          editor.commit();


                                      } else {
                                          User currUser = users.get(0);

                                          currUser.save();
                                          //This is NOT the backend id, this is the sugar id
                                          editor.putString("loggedInId", Long.toString(currUser.getId()));
                                          editor.commit();
                                      }

                                      Intent intent = new Intent(currContext, LoginActivity2.class);

                                      startActivity(intent);
                                  }
                              }

                );
            }

            @Override
            public void onRequestFailed(final String message) {
                //NOTE: parameter validation and filtering is handled by the backend, just show the
                //returned error message to the user
                Log.d(TAG, "Received error from Backend: " + message);
                runOnUiThread(new Runnable() {
                    public void run() {
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}




