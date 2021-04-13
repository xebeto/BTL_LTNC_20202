package com.example.web_sell_fruit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "hoadonnhap")
public class HoaDonNhap extends BaseEntity{

    @Column(name = "tong_tien")
    private int tong_tien;

    @OneToMany(mappedBy = "hoadonnhap")
    private List<ChiTietHoaDonNhap> hoadonnhap;


    public int getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(int tong_tien) {
        this.tong_tien = tong_tien;
    }

    public List<ChiTietHoaDonNhap> getHoadonnhap() {
        return hoadonnhap;
    }

    public void setHoadonnhap(List<ChiTietHoaDonNhap> hoadonnhap) {
        this.hoadonnhap = hoadonnhap;
    }
}
