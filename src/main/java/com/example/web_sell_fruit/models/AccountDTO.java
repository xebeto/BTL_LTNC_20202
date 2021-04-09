package com.example.web_sell_fruit.models;

import java.util.List;

public class AccountDTO extends BaseDTO{


    private String username;

    private String email;

    private String password;

    private boolean active;

    private List<String> roleEntity;


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<String> getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(List<String> roleEntity) {
        this.roleEntity = roleEntity;
    }
}
