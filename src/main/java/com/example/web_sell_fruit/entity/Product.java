package com.example.web_sell_fruit.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "product")
public class Product extends  BaseEntity{
    private static final long serialVersionUID = 1L;

    @Column(name = "name_product")
    private String name_product;

    @Column(name = "so_luong")
    private int so_luong;

    @Column(name = "price_near")
    private int price_near;

    @Column(name = "active")
    private boolean active;

    @Column(name = "url_image")
    private String url_image;

    @ManyToOne
    @JoinColumn(name = "id_dvt")
    private DonViTinh donvitinh;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "product_provider", joinColumns = @JoinColumn(name = "id_product"), inverseJoinColumns = @JoinColumn(name = "id_provider"))
    private List<Provider> provider;

    @OneToMany(mappedBy = "product")
    private List<ChiTietHoaDonNhap> hoadonnhap;

    @OneToMany(mappedBy = "product")
    private List<ChiTietHoaDonXuat> hoadonxuat;

    @OneToMany(mappedBy="product")
    private List<YeuCauDonHang> yeucaudonhang;

}
