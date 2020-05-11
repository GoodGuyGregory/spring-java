package com.gregory.frameworkapp;

// imports for Spring
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class App {
    public static void main(String[] args) {
        System.out.println("Framework App");

        // Specifies Configuration file for Beans for dependency injection
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        // Non-Dependency Injection for Making an Object
        // Samsung s7 = new Samsung();
        // s7.config();

        // Dependency injection with Spring
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}