package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "active")
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private RoleEntity roleuser;

    @OneToOne
    @JoinColumn(name="id_staff_customer")
    private StaffEntity staff;

    @OneToOne(mappedBy="account")
    private CustomerEntity customer;

}