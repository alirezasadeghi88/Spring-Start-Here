package com.learn.ch9_rev2.controller;
@Controller
public class LoginController {

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }
}
