package org.academiadecodigo.service;

import org.academiadecodigo.model.User;

/**
 * Created by codecadet on 08/12/16.
 */
public interface UserService {

    void addUser(User user);

    void removeUser(User user);

    User findUser(String username);

    User getUser(String username);

}
