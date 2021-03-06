package org.academiadecodigo.service;

import org.academiadecodigo.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by codecadet on 08/12/16.
 */
public class MockUserService implements UserService {

    private Map<String, User> userMap;

    public MockUserService() {
        userMap = new HashMap<>();
    }

    public MockUserService(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public void addUser(User user) {
        if (!userMap.containsKey(user.getUsername())) {
            userMap.put(user.getUsername(), user);
            System.out.println("User " + user.getUsername() + " added!");

        } else {
            System.out.println(user.getUsername() + " already exists!");
        }
    }

    @Override
    public User findByName(String username) {
        return userMap.get(username);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public long count() {
        return userMap.size();
    }

}
