package org.academiadecodigo.service;

import org.academiadecodigo.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 08/12/16.
 */
public class MockUserService implements UserService{

    private List<User> userList;

    public MockUserService(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void addUser(User user) {
        if ((findUser(user.getUsername()) != null)) {
            System.out.println(user.getUsername() + " already exists!");
            return;
        }
        System.out.println("User " + user.getUsername() + " added!");
        userList.add(user);
    }

    @Override
    public void removeUser(User user) {
        userList.remove(user);
    }

    @Override
    public User findUser(String username) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)) {
                return userList.get(i);
            }
        }
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }
}
