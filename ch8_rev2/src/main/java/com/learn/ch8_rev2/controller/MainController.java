package com.learn.ch8_rev2.controller;

import jdk.internal.classfile.impl.BufferedCodeBuilder;

public class MainController {

    @RequestMapping("/home")
    public String home(@RequestParam String color,
                       Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);
        return "home.html";
    }
}
