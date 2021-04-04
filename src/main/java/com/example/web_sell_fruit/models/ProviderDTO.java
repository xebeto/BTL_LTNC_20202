package com.example.web_sell_fruit.models;

public class ProviderDTO extends BaseDTO{
    private String Name_provider;

    private String Address_provider;

    private int Number_phone;

    public String getName_provider() {
        return Name_provider;
    }

    public void setName_provider(String name_provider) {
        Name_provider = name_provider;
    }

    public String getAddress_provider() {
        return Address_provider;
    }

    public void setAddress_provider(String address_provider) {
        Address_provider = address_provider;
    }

    public int getNumber_phone() {
        return Number_phone;
    }

    public void setNumber_phone(int number_phone) {
        Number_phone = number_phone;
    }
}
