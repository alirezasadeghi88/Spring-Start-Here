package com.learn.ch10_rev2.controller;

import com.learn.ch10_rev2.model.Country;

@RestController
public class CountryController {


    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(c);
    }
}
