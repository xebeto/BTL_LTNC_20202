package com.example.web_sell_fruit.models;



import java.util.List;

public class ProductDTO extends BaseDTO{

    private String name_product;

    private int so_luong;
    private int price_near;
    private String url_image;
    private String category;
    private boolean active;
    private List<ProviderDTO> providers;
    private List<ChiTietHoaDonNhapDTO> hoadonnhaps;
    private List<YeuCauDonHangDTO> yeucaudonhangs;

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

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<ProviderDTO> getProviders() {
        return providers;
    }

    public void setProviders(List<ProviderDTO> providers) {
        this.providers = providers;
    }

    public List<ChiTietHoaDonNhapDTO> getHoadonnhaps() {
        return hoadonnhaps;
    }

    public void setHoadonnhaps(List<ChiTietHoaDonNhapDTO> hoadonnhaps) {
        this.hoadonnhaps = hoadonnhaps;
    }

    public List<YeuCauDonHangDTO> getYeucaudonhangs() {
        return yeucaudonhangs;
    }

    public void setYeucaudonhangs(List<YeuCauDonHangDTO> yeucaudonhangs) {
        this.yeucaudonhangs = yeucaudonhangs;
    }
}
