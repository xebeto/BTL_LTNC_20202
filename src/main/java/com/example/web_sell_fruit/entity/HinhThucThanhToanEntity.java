package com.example.web_sell_fruit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hinhthucthanhtoan")
public class HinhThucThanhToanEntity extends BaseEntity{

    @Column(name = "hinh_thuc")
    private String hinh_thuc;

}
