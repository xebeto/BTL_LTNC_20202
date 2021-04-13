package com.example.web_sell_fruit.entity;


import javax.persistence.*;

@Entity
@Table(name = "hoadonxuat")
public class HoaDonXuat extends  BaseEntity{


    @Column(name="tong_tien")
    private int tong_tien;


    @ManyToOne
    @JoinColumn(name = "id_staff")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "ic_hinhthucthanhtoan")
    private HinhThucThanhToan hinhthucthanhtoan;

    public int getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(int tong_tien) {
        this.tong_tien = tong_tien;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public HinhThucThanhToan getHinhthucthanhtoan() {
        return hinhthucthanhtoan;
    }

    public void setHinhthucthanhtoan(HinhThucThanhToan hinhthucthanhtoan) {
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }
}
