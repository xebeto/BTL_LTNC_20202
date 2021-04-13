package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
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

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getPrice_near() {
        return price_near;
    }

    public void setPrice_near(int price_near) {
        this.price_near = price_near;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public DonViTinh getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(DonViTinh donvitinh) {
        this.donvitinh = donvitinh;
    }

    public List<Provider> getProvider() {
        return provider;
    }

    public void setProvider(List<Provider> provider) {
        this.provider = provider;
    }

    public List<ChiTietHoaDonNhap> getHoadonnhap() {
        return hoadonnhap;
    }

    public void setHoadonnhap(List<ChiTietHoaDonNhap> hoadonnhap) {
        this.hoadonnhap = hoadonnhap;
    }

    public List<ChiTietHoaDonXuat> getHoadonxuat() {
        return hoadonxuat;
    }

    public void setHoadonxuat(List<ChiTietHoaDonXuat> hoadonxuat) {
        this.hoadonxuat = hoadonxuat;
    }

    public List<YeuCauDonHang> getYeucaudonhang() {
        return yeucaudonhang;
    }

    public void setYeucaudonhang(List<YeuCauDonHang> yeucaudonhang) {
        this.yeucaudonhang = yeucaudonhang;
    }
}
