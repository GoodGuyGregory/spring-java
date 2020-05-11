package com.gregory.frameworkapp;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
    // implements the process method
    public void process() {
        System.out.println("Snapdragon is the Best CPU on the market");
    }
}