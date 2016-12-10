package org.academiadecodigo.auth;

import org.academiadecodigo.service.UserService;

/**
 * Created by codecadet on 08/12/16.
 */
public class Authenticator {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
