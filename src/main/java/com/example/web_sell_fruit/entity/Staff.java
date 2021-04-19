package com.example.web_sell_fruit.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "staff")
public class Staff extends BaseEntity{

    @Column(name = "name_staff")
    private String name_staff;

    @Column(name = "phone_number_staff")
    private int phone_number_staff;

    @Column(name = "card_id_staff")
    private  int card_int_staff;

    @Column(name = "address")
    private String address;

    @OneToOne
    @JoinColumn(name="id_user")
    private Account account;

    @OneToMany(mappedBy="staff")
    private List<HoaDonXuat> hoadonxuat;


}
