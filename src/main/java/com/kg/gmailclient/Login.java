package com.kg.gmailclient;

/**
 * login
 */
public class Login {

    String username;
    String password;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;

    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setusername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "username::" + username + "" + "Password::" + password;
    }
}