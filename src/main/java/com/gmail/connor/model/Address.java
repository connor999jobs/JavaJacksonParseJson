package com.gmail.connor.model;

public class Address {
    private String street;
    private String numberHous;
    private String city;

    public Address(String street, String numberHous, String city) {
        this.street = street;
        this.numberHous = numberHous;
        this.city = city;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberHous() {
        return numberHous;
    }

    public void setNumberHous(String numberHous) {
        this.numberHous = numberHous;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", numberHous='" + numberHous + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
