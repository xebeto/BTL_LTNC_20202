package com.example.web_sell_fruit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hoadonnhap")
public class HoaDonNhapEntity extends BaseEntity{

    @Column(name = "tong_tien")
    private int tong_tien;




}
