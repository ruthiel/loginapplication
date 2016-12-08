package org.academiadecodigo.model;

/**
 * Created by codecadet on 08/12/16.
 */
public class User {

    private String username;
    private String email;
    private int password;

    public User() {
    }

    public User(int password, String email, String username) {
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
