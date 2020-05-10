package com.gregory.springapp;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public void drive() {
        // Hindi for Drives
        System.out.println("Chal raha hai...");
    }
}