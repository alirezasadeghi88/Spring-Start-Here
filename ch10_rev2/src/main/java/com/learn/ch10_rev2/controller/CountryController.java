package com.learn.ch10_rev2.controller;

import com.learn.ch10_rev2.model.Country;

@RestController
public class CountryController {


    @GetMapping("/france")
    public ResponseEntity<Country> france() {

    }
}
