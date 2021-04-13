package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "staff")
public class Staff extends BaseEntity{

    @Column(name = "name_staff")
    private String name_staff;

    @Column(name = "phone_number_staff")
    private int phone_number_staff;

    @Column(name = "card_id_staff")
    private  int card_int_staff;

    @Column(name = "address")
    private String address;

    @OneToOne(mappedBy="staff")
    private Account account;

    @OneToMany(mappedBy="staff")
    private List<HoaDonXuat> hoadonxuat;

    public String getName_staff() {
        return name_staff;
    }

    public void setName_staff(String name_staff) {
        this.name_staff = name_staff;
    }

    public int getPhone_number_staff() {
        return phone_number_staff;
    }

    public void setPhone_number_staff(int phone_number_staff) {
        this.phone_number_staff = phone_number_staff;
    }

    public int getCard_int_staff() {
        return card_int_staff;
    }

    public void setCard_int_staff(int card_int_staff) {
        this.card_int_staff = card_int_staff;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
