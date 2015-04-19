package com.example.paul.cs407project.Model;

import java.util.Date;

/**
 * Created by ayza91 on 4/18/15.
 */
public class Friend {
    public int backendId;

    public String name;
    public String title;
    public String nickname;

    public boolean all;
    public boolean family;
    public boolean friend;
    public boolean work;
    public boolean school;
    public boolean personal;

    public Date created_at;
    public Date updated_at;

    public Friend(){
        name = "";
        title = "";
        nickname = "";
        created_at = new Date();
        updated_at = new Date();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n\t id: " + backendId);
        sb.append("\n\t name: " + name);
        sb.append("\n\t title: " + title);
        sb.append("\n\t nickname: " + nickname);
        sb.append("\n\t all: " + all);
        sb.append("\n\t family: " + family);
        sb.append("\n\t friend: " + friend);
        sb.append("\n\t work: " + work);
        sb.append("\n\t school: " + school);
        sb.append("\n\t personal: " + personal);

        return sb.toString();
    }
}
