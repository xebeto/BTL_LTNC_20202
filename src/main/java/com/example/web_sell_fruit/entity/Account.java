package com.example.web_sell_fruit.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "account")
public class Account extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "active")
    private boolean active;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "account_role", joinColumns = @JoinColumn(name = "id_account"), inverseJoinColumns = @JoinColumn(name = "id_role"))
    private List<Role> roles;

    @OneToOne(mappedBy="account")
    private Staff staff;

    @Column(name = "keyvalidate")
    private String key;

    @OneToOne(mappedBy="account")
    private Customer customer;

}