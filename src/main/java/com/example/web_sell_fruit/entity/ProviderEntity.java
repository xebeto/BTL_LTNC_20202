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

    public String getName_provider() {
        return name_provider;
    }

    public void setName_provider(String name_provider) {
        this.name_provider = name_provider;
    }

    public String getAddress_provider() {
        return address_provider;
    }

    public void setAddress_provider(String address_provider) {
        this.address_provider = address_provider;
    }

    public int getPhone_provider() {
        return phone_provider;
    }

    public void setPhone_provider(int phone_provider) {
        this.phone_provider = phone_provider;
    }

    public List<ProductEntity> getProduct() {
        return product;
    }

    public void setProduct(List<ProductEntity> product) {
        this.product = product;
    }
}
