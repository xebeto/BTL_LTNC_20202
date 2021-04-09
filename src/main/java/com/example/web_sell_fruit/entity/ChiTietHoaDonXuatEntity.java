package com.example.web_sell_fruit.entity;

import javax.persistence.*;

@Entity
@Table(name = "chitiethoadonxuat")
public class ChiTietHoaDonXuatEntity extends BaseEntity{

    @Column
    private int so_luong;
    @Column
    private  int gia_ban;

    @ManyToOne
    @MapsId("id_product")
    @JoinColumn(name = "id_product")
    private ProductEntity product;


    @ManyToOne
    @MapsId("id_hoadonxuat")
    @JoinColumn(name = "id_hoadonxuat")
    private HoaDonXuatEntity hoadonxuat;

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

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public HoaDonXuatEntity getHoadonxuat() {
        return hoadonxuat;
    }

    public void setHoadonxuat(HoaDonXuatEntity hoadonxuat) {
        this.hoadonxuat = hoadonxuat;
    }
}
