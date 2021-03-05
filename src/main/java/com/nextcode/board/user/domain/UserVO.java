package com.nextcode.board.user.domain;

import java.io.Serializable;

public class UserVO implements Serializable {
    //    private String userId;
//    private String userPw;
    private final long serialVersionUID = -234343324234234l;
    private String email;
    private String password;

    public UserVO(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
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
                ", password='" + password + '\'' +
                '}';
    }
}
