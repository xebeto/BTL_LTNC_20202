package com.example.web_sell_fruit.entity;


import javax.persistence.*;

@Entity
@Table(name = "yeucaudonhang")
public class YeuCauDonHangEntity extends BaseEntity{


    @Column(name = "activity")
    private Boolean activity;


    @ManyToOne()
    @JoinColumn(name = "id_product")
    private ProductEntity product;

    @ManyToOne()
    @JoinColumn(name = "id_customer")
    private CustomerEntity customer;

}
