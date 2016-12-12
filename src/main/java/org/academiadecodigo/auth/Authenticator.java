package org.academiadecodigo.auth;

import org.academiadecodigo.service.UserService;

/**
 * Created by codecadet on 08/12/16.
 */
public class Authenticator {

    private UserService userService;

    public boolean authenticate(UserService userService, String username, String password) {
        boolean toReturn = false;



        return true;
    }

    public boolean register(UserService userService) {
        boolean toReturn = false;
        return true;
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
