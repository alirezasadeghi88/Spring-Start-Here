package com.learn.ch8_rev2.controller;

import jdk.internal.classfile.impl.BufferedCodeBuilder;

public class MainController {

    @RequestMapping("/home")
    public String home(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String color,
            Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }
}
