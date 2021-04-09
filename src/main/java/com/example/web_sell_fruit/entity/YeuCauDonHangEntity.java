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

    public Boolean getActivity() {
        return activity;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }
}
