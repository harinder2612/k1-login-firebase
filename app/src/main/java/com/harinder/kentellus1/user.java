package com.harinder.kentellus1;

/**
 * Created by WIN8.1 on 03-06-2017.
 */

public class user {
    private String name,email,password;

    user(){}

    user (String name, String email, String password)
    {
        this.name=name;
        this.email=email;
        this.password=password;
    }

    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
