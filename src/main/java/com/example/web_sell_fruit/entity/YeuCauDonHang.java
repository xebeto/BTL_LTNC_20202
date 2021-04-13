package com.example.web_sell_fruit.entity;


import javax.persistence.*;

@Entity
@Table(name = "yeucaudonhang")
public class YeuCauDonHang extends BaseEntity{


    @Column(name = "activity")
    private Boolean activity;


    @ManyToOne()
    @JoinColumn(name = "id_product")
    private Product product;

    @ManyToOne()
    @JoinColumn(name = "id_customer")
    private Customer customer;

    public Boolean getActivity() {
        return activity;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
