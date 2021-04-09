package com.example.web_sell_fruit.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductEntity extends  BaseEntity{
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
    private DonViTinhEntity donvitinh;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "product_provider", joinColumns = @JoinColumn(name = "id_product"), inverseJoinColumns = @JoinColumn(name = "id_provider"))
    private List<ProviderEntity> provider;

    @OneToMany(mappedBy = "product")
    private List<ChiTietHoaDonNhapEntity> hoadonnhap;

    @OneToMany(mappedBy = "product")
    private List<ChiTietHoaDonXuatEntity> hoadonxuat;

    @OneToMany(mappedBy="product")
    private List<YeuCauDonHangEntity> yeucaudonhang;

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

    public DonViTinhEntity getDonvitinh() {
        return donvitinh;
    }

    public void setDonvitinh(DonViTinhEntity donvitinh) {
        this.donvitinh = donvitinh;
    }

    public List<ProviderEntity> getProvider() {
        return provider;
    }

    public void setProvider(List<ProviderEntity> provider) {
        this.provider = provider;
    }

    public List<ChiTietHoaDonNhapEntity> getHoadonnhap() {
        return hoadonnhap;
    }

    public void setHoadonnhap(List<ChiTietHoaDonNhapEntity> hoadonnhap) {
        this.hoadonnhap = hoadonnhap;
    }

    public List<ChiTietHoaDonXuatEntity> getHoadonxuat() {
        return hoadonxuat;
    }

    public void setHoadonxuat(List<ChiTietHoaDonXuatEntity> hoadonxuat) {
        this.hoadonxuat = hoadonxuat;
    }

    public List<YeuCauDonHangEntity> getYeucaudonhang() {
        return yeucaudonhang;
    }

    public void setYeucaudonhang(List<YeuCauDonHangEntity> yeucaudonhang) {
        this.yeucaudonhang = yeucaudonhang;
    }
}
