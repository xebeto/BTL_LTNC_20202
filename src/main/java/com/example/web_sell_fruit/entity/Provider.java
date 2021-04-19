package com.example.web_sell_fruit.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "provider")
public class Provider extends  BaseEntity{

    @Column(name = "name_provider")
    private String name_provider;

    @Column(name = "address_provider")
    private String address_provider;

    @Column(name = "phone_provider")
    private int phone_provider;

    @ManyToMany(mappedBy = "provider")
    private List<Product> product;

}
