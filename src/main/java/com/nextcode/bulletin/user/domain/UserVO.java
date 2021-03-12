package com.nextcode.bulletin.user.domain;

import org.springframework.context.annotation.Scope;

import java.io.Serializable;

@Scope("sesssion")
public class UserVO implements Serializable {
    private static final long E = -5292057038102685449L;
    private String email;
    private String username;

    private String password;

    public UserVO(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
