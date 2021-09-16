package com.company;

public class User {
    public User(String name, String email){
        this.name = name;
        this.email = email;
        System.out.println("Hoşgeldiniz " + this.name + "\n");
    }

    String name;
    String email;
}
