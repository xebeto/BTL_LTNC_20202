package com.example.web_sell_fruit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "provider")
public class Provider extends  BaseEntity{

    @Column(name = "name_provider")
    private String name;

    @Column(name = "address_provider")
    private String address;

    @Column(name = "phone_provider")
    private int phone;

    @ManyToMany(mappedBy = "provider")
    private List<Product> product;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
