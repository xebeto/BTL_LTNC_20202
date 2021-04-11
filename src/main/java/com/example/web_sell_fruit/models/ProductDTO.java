package com.example.web_sell_fruit.models;



import java.util.List;

public class ProductDTO extends BaseDTO{

    private String name_product;

    private int so_luong;
    private int price_near;
    private String url_image;
    private List<ProviderDTO> providers;
    private List<ChiTietHoaDonNhapDTO> hoadonnhaps;
    private List<YeuCauDonHangDTO> yeucaudonhangs;
}
