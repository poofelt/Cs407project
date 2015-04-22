package com.example.paul.cs407project.Model;

import com.orm.SugarRecord;
import java.util.Date;
/**
 * Created by ayza91 on 4/18/15.
 */
public class User extends SugarRecord<User> {

    public int backendId;
    public String inviteCode;

    public String name;
    public String title;

    public Date created_at;
    public Date updated_at;

    public User() {
        name = "";
        title = "";
        created_at = new Date();
        updated_at = new Date();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("\n\t id: " + backendId);
        sb.append("\n\t inviteCode: " + inviteCode);
        sb.append("\n\t name: " + name);
        sb.append("\n\t title: " + title);

        return sb.toString();
    }
}
