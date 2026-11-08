package com.learn.ch9_rev2.processor;

import com.learn.ch9_rev2.service.LoggedUserManagementService;
import com.learn.ch9_rev2.service.LoginCountService;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    private String username;
    private String password;
}
