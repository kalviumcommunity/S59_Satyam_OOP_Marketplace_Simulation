package com.marketplace.users;

public abstract class User {
    protected String name;

    public abstract void displayRole();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
