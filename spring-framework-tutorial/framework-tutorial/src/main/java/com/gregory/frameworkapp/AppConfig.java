package com.gregory.frameworkapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// to avoid writing bean declarations you can use the @Configuration and ComponentScan
@Configuration
@ComponentScan(basePackages = "com.gregory.frameworkapp")
public class AppConfig {

    // adds a Bean definition
    // @Bean
    // public Samsung getPhone() {
    // return new Samsung();
    // }

    // @Bean
    // public MobileProcessor getProcessor() {
    // return new Snapdragon();
    // }
}