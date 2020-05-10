package com.gregory.springapp;


public class Tire {
    // setter injection
    private String brand;

    // Construction injection
    // public Tire(String brand) {
    //     super();
    //     this.brand = brand;
    // }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Tires are on the car";
    }
}