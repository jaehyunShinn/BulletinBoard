package com.nextcode.bulletin.user.domain;

import java.io.Serializable;

public class UserVO implements Serializable {
    private static final long serialVersionUID = -5292057038102685449L;
    private String email;
    private String username;

    public String getEmail() {
        return email == null ? null : email.trim();
    }

    public UserVO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username == null ? null : username.trim();
    }

    public UserVO setUsername(String username) {
        this.username = username;
        return this;
    }
}
