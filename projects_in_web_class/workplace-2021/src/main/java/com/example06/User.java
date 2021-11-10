package com.example06;

public class User {
    private String name;
    private Address address = null;
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(String name, Address address){
        this.name = name;
        this.address = address;
    }
}
