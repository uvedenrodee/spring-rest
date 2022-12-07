package com.uvedenrodee.demo.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Accounts")
public class Account {

    @Id
    @SequenceGenerator(name="accounts_user_id_seq",
            sequenceName="accounts_user_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="accounts_user_id_seq")
    private Long userId;

    private String username;

    private String password;

    private String email;

    private Timestamp createdOn;

    private Timestamp lastLogin;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }
}
