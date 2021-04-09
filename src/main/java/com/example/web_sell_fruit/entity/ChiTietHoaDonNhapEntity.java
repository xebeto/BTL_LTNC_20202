package com.example.web_sell_fruit.entity;


import javax.persistence.*;

@Entity
@Table(name = "chitiethoadonnhap")
public class ChiTietHoaDonNhapEntity extends BaseEntity{


    @Column
    private int so_luong;
    @Column
    private int gia_nhap;
    @Column
    private  int gia_ban;

    @ManyToOne
    @MapsId("id_product")
    @JoinColumn(name = "id_product")
    private ProductEntity product;


    @ManyToOne
    @MapsId("id_hoadonnhap")
    @JoinColumn(name = "id_hoadonnhap")
    private HoaDonNhapEntity hoadonnhap;

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

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public HoaDonNhapEntity getHoadonnhap() {
        return hoadonnhap;
    }

    public void setHoadonnhap(HoaDonNhapEntity hoadonnhap) {
        this.hoadonnhap = hoadonnhap;
    }
}
