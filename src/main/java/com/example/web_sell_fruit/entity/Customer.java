package com.example.web_sell_fruit.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name= "customer")
public class Customer extends BaseEntity{

    @Column(name="name_customer")
    private String name_customer;

    @Column(name = "address_customer")
    private String address_customer;

    @Column(name = "phone_customer")
    private int phone_customer;

    @OneToOne
    @JoinColumn(name = "id_user")
    private Account account;

    @OneToMany(mappedBy="customer")
    private List<HoaDonXuat> hoadonxuat;

    @OneToMany(mappedBy="customer")
    private List<YeuCauDonHang> yeucaudonhang;


}
