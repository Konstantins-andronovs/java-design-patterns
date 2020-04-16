package com.andronov;

import javax.enterprise.inject.Model;

@Model
public class User {

    private String name;

    public User() {
        this.name = "John Smith";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
