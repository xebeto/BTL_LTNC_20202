package com.example.web_sell_fruit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "provider")
public class ProviderEntity extends  BaseEntity{

    @Column(name = "name_provider")
    private String name_provider;

    @Column(name = "address_provider")
    private String address_provider;

    @Column(name = "phone_provider")
    private int phone_provider;

    @ManyToMany(mappedBy = "provider")
    private List<ProductEntity> product;
}
