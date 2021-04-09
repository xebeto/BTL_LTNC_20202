package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "customer")
public class CustomerEntity extends BaseEntity{

    @Column(name="name_customer")
    private String name_customer;

    @Column(name = "address_customer")
    private String address_customer;

    @Column(name = "phone_customer")
    private int phone_customer;

    @OneToOne
    @JoinColumn(name = "id_user")
    private AccountEntity account;

    @OneToMany(mappedBy="customer")
    private List<HoaDonXuatEntity> hoadonxuat;

    @OneToMany(mappedBy="customer")
    private List<YeuCauDonHangEntity> yeucaudonhang;

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

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public List<HoaDonXuatEntity> getHoadonxuat() {
        return hoadonxuat;
    }

    public void setHoadonxuat(List<HoaDonXuatEntity> hoadonxuat) {
        this.hoadonxuat = hoadonxuat;
    }

    public List<YeuCauDonHangEntity> getYeucaudonhang() {
        return yeucaudonhang;
    }

    public void setYeucaudonhang(List<YeuCauDonHangEntity> yeucaudonhang) {
        this.yeucaudonhang = yeucaudonhang;
    }
}
