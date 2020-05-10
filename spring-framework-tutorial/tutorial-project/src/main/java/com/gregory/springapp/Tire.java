package com.gregory.springapp;


public class Tire {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Tire [Brand=" +  brand + "]";
    }
}