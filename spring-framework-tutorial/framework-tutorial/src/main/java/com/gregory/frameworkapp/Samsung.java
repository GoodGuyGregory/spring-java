package com.gregory.frameworkapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Non qualified and decapitalized
public class Samsung {

    @Autowired
    // if two interface implementations are used this allows for specifications
    @Qualifier("snapdragon")
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config() {
        System.out.println("Samsung Galaxy S7");
        System.out.println("====================");
        System.out.println("Processor:  Octa Core");
        System.out.println("Memory:  4 GB RAM");
        System.out.println("Camera:  12 MP");
        cpu.process();
    }
}