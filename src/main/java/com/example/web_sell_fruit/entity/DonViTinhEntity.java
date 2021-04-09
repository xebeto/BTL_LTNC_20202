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

    public String getName_dvt() {
        return name_dvt;
    }

    public void setName_dvt(String name_dvt) {
        this.name_dvt = name_dvt;
    }

    public List<ProductEntity> getProduct() {
        return product;
    }

    public void setProduct(List<ProductEntity> product) {
        this.product = product;
    }
}
