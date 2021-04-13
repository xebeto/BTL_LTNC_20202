package com.example.web_sell_fruit.entity;


import javax.persistence.*;

@Entity
@Table(name = "chitiethoadonnhap")
public class ChiTietHoaDonNhap extends BaseEntity{


    @Column
    private int so_luong;
    @Column
    private int gia_nhap;
    @Column
    private  int gia_ban;

    @ManyToOne
    @MapsId("id_product")
    @JoinColumn(name = "id_product")
    private Product product;


    @ManyToOne
    @MapsId("id_hoadonnhap")
    @JoinColumn(name = "id_hoadonnhap")
    private HoaDonNhap hoadonnhap;

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getGia_nhap() {
        return gia_nhap;
    }

    public void setGia_nhap(int gia_nhap) {
        this.gia_nhap = gia_nhap;
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

    public HoaDonNhap getHoadonnhap() {
        return hoadonnhap;
    }

    public void setHoadonnhap(HoaDonNhap hoadonnhap) {
        this.hoadonnhap = hoadonnhap;
    }
}
