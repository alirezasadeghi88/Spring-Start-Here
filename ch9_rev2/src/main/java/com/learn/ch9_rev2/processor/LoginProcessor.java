package com.learn.ch9_rev2.processor;

public class LoginProcessor {
    private String username;
    private String password;

    public LoginProcessor(
            LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }
}
