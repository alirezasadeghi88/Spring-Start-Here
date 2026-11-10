package com.learn.ch10_rev2.controller;
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
