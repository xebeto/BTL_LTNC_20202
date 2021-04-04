package com.example.web_sell_fruit.models;

public class StaffDTO extends CustomerDTO{
     private int card_id_staff;

     private  String country_staff;

    public int getCard_id_staff() {
        return card_id_staff;
    }

    public void setCard_id_staff(int card_id_staff) {
        this.card_id_staff = card_id_staff;
    }

    public String getCountry_staff() {
        return country_staff;
    }

    public void setCountry_staff(String country_staff) {
        this.country_staff = country_staff;
    }
}
