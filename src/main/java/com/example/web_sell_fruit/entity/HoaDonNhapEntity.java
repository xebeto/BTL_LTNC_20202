package com.example.web_sell_fruit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "hoadonnhap")
public class HoaDonNhapEntity extends BaseEntity{

    @Column(name = "tong_tien")
    private int tong_tien;

    @OneToMany(mappedBy = "hoadonnhap")
    private List<ChiTietHoaDonNhapEntity> hoadonnhap;


    public int getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(int tong_tien) {
        this.tong_tien = tong_tien;
    }

    public List<ChiTietHoaDonNhapEntity> getHoadonnhap() {
        return hoadonnhap;
    }

    public void setHoadonnhap(List<ChiTietHoaDonNhapEntity> hoadonnhap) {
        this.hoadonnhap = hoadonnhap;
    }
}
