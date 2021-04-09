package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="donvitinh")
public class DonViTinhEntity extends  BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "name_dvt")
    private String name_dvt;


    @OneToMany(mappedBy = "donvitinh")
    private List<ProductEntity> product;

}
