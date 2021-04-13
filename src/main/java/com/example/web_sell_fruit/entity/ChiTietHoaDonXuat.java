package com.example.web_sell_fruit.entity;

import javax.persistence.*;

@Entity
@Table(name = "chitiethoadonxuat")
public class ChiTietHoaDonXuat extends BaseEntity{

    @Column
    private int so_luong;
    @Column
    private  int gia_ban;

    @ManyToOne
    @MapsId("id_product")
    @JoinColumn(name = "id_product")
    private Product product;


    @ManyToOne
    @MapsId("id_hoadonxuat")
    @JoinColumn(name = "id_hoadonxuat")
    private HoaDonXuat hoadonxuat;

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(int gia_ban) {
        this.gia_ban = gia_ban;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public HoaDonXuat getHoadonxuat() {
        return hoadonxuat;
    }

    public void setHoadonxuat(HoaDonXuat hoadonxuat) {
        this.hoadonxuat = hoadonxuat;
    }
}
