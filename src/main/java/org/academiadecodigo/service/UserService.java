package org.academiadecodigo.service;

import org.academiadecodigo.model.User;

/**
 * Created by codecadet on 08/12/16.
 */
public interface UserService {

    void authenticate();

    User findByName();
}
