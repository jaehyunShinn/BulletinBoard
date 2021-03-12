package com.nextcode.bulletin.user.domain;

public class UserForm {
    private String email;
    private String password;

    public String getEmail() {
        return email == null ? null : email.trim();
    }

    public UserForm setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {

        return password == null ? null : password.trim();
    }

    public UserForm setPassword(String password) {
        this.password = password;
        return this;

    }

    @Override
    public String toString() {
        return "UserForm{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
