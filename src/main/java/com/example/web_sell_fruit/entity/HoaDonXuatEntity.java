package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hoadonxuat")
public class HoaDonXuatEntity extends  BaseEntity{


    @Column(name="tong_tien")
    private int tong_tien;


    @ManyToOne
    @JoinColumn(name = "id_staff")
    private StaffEntity staff;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private CustomerEntity customer;

    @ManyToOne
    @JoinColumn(name = "ic_hinhthucthanhtoan")
    private HinhThucThanhToanEntity hinhthucthanhtoan;


}
