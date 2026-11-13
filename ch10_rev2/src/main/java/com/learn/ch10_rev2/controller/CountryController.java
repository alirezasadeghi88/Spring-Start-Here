package com.learn.ch10_rev2.controller;

import com.learn.ch10_rev2.model.Country;

@RestController
public class CountryController {


    @GetMapping("/all")
    public List<Country> countries() {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 47);
        return List.of(c1,c2);
    }
}
