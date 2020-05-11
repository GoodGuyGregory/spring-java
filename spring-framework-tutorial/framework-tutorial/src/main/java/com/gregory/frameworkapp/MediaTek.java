package com.gregory.frameworkapp;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {
    public void process() {
        System.out.println("Second Best CPU (not actually)");
    }
}