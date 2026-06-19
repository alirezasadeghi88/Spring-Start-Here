package com.learn.model;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "KOKO";



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
