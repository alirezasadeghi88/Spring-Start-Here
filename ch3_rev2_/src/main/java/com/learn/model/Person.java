package com.learn.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name = "Ella";
    private final Parrot parrot;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }


}
