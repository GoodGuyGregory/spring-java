package com.gregory.frameworkapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

    // adds a Bean definition
    @Bean
    public Samsung getPhone() {
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor() {
        return new Snapdragon();
    }
}