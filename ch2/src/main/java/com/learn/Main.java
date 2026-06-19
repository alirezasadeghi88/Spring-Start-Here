package com.learn;

import com.learn.model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.AnnotationTypeMismatchException;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext();
        Parrot parrot = new Parrot();
    }
}
