package com.gregory.springapp;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Car implements Vehicle {

// mixes annotation and configure based annotation
    @Autowired
    private Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void drive() {
        // Hindi for Drives
        System.out.println("Car " + tire);
    }
}