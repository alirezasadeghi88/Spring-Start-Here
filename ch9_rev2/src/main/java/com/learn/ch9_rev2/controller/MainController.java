package com.learn.ch9_rev2.controller;

import com.learn.ch9_rev2.service.LoggedUserManagementService;

public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(
            LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }
}
