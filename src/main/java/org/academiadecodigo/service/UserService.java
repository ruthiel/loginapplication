package org.academiadecodigo.service;

import org.academiadecodigo.model.User;

import java.util.List;

/**
 * Created by codecadet on 08/12/16.
 */
public interface UserService {

    void addUser(User user);

    User findByName(String username);

    List<User> findAll();

    long count();
}
