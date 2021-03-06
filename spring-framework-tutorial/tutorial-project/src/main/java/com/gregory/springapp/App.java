package com.gregory.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello from App!");

        System.out.println("Creates a Car Class");

        Car car = new Car();
        car.drive();

        // in order to run the bike class without changing hardcode we must use
        // dependency injection
        Bike bike = new Bike();
        bike.drive();

        // Create interface class to only change one side
        System.out.println("Interface implementation: ");
        Vehicle obj = new Bike();
        obj.drive();

        // instead of all of this let's use the spring framework for dependency
        // injection method

        // getBean is a method is from either BeanFactory or ApplicationContext
        // Small applications are for BeanFactory
        // Larger Applications should use ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // vehicle needs to be specified in from an XML file
        Car springObject = (Car) context.getBean("car");
        springObject.drive();

        // Tire t = (Tire) context.getBean("tire");
        // System.out.println(t);
    }
}