package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "customer")
public class Customer extends BaseEntity{

    @Column(name="name_customer")
    private String name_customer;

    @Column(name = "address_customer")
    private String address_customer;

    @Column(name = "phone_customer")
    private int phone_customer;

    @OneToOne
    @JoinColumn(name = "id_user")
    private Account account;

    @OneToMany(mappedBy="customer")
    private List<HoaDonXuat> hoadonxuat;

    @OneToMany(mappedBy="customer")
    private List<YeuCauDonHang> yeucaudonhang;

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getAddress_customer() {
        return address_customer;
    }

    public void setAddress_customer(String address_customer) {
        this.address_customer = address_customer;
    }

    public int getPhone_customer() {
        return phone_customer;
    }

    public void setPhone_customer(int phone_customer) {
        this.phone_customer = phone_customer;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<HoaDonXuat> getHoadonxuat() {
        return hoadonxuat;
    }

    public void setHoadonxuat(List<HoaDonXuat> hoadonxuat) {
        this.hoadonxuat = hoadonxuat;
    }

    public List<YeuCauDonHang> getYeucaudonhang() {
        return yeucaudonhang;
    }

    public void setYeucaudonhang(List<YeuCauDonHang> yeucaudonhang) {
        this.yeucaudonhang = yeucaudonhang;
    }
}
