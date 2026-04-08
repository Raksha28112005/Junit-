package com.example;

public class Greeting {
    public String getMessage(String name) {
        if (name == null || name.trim().isEmpty()) return "Hello, Guest!";
        return "Hello, " + name + "!";
    }
}