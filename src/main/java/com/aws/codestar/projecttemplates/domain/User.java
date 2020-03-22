package com.aws.codestar.projecttemplates.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Integer userId;

    private String userFirstName;
    private String userEmail;
    private String userPassword;

    public User(Integer userId, String userFirstName, String userEmail, String userPassword) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public User(String userFirstName, String userEmail, String userPassword) {
        this.userFirstName = userFirstName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public User(){}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userName) {
        this.userFirstName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
