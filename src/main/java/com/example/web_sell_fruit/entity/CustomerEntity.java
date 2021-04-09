package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "customer")
public class CustomerEntity extends BaseEntity{

    @Column(name="name_customer")
    private String name_customer;

    @Column(name = "address_customer")
    private String address_customer;

    @Column(name = "phone_customer")
    private int phone_customer;

    @OneToOne
    @JoinColumn(name = "id_user")
    private AccountEntity account;

    @OneToMany(mappedBy="customer")
    private List<HoaDonXuatEntity> hoadonxuat;

    @OneToMany(mappedBy="customer")
    private List<YeuCauDonHangEntity> yeucaudonhang;
}
