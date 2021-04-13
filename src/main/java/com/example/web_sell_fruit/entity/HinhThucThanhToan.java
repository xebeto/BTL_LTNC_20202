package com.example.web_sell_fruit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hinhthucthanhtoan")
public class HinhThucThanhToan extends BaseEntity{

    @Column(name = "hinh_thuc")
    private String hinh_thuc;

    public String getHinh_thuc() {
        return hinh_thuc;
    }

    public void setHinh_thuc(String hinh_thuc) {
        this.hinh_thuc = hinh_thuc;
    }
}
