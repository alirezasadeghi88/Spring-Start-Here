package com.learn.ch9_rev2.service;
@Service
@ApplicationScope
public class LoginCountService {

    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
