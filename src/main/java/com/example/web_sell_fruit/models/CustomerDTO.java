package com.example.web_sell_fruit.models;

public class CustomerDTO extends BaseDTO{

    private String Name;

    private String Address;

    private int Phone_Number;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }
}
