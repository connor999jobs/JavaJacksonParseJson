package com.gmail.connor.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private Address address;
    private long[] phoneNumber;
    private String role;
    private List<String> cities;
    private Map<String, String> properties;

    public Employee(int id, String name, String surname, Address address, long[] phoneNumber, String role, List<String> cities, Map<String, String> prop) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.cities = cities;
        this.properties = prop;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", phoneNumber=" + Arrays.toString(phoneNumber) +
                ", role='" + role + '\'' +
                ", cities=" + cities +
                ", prop=" + properties +
                '}';
    }
}
