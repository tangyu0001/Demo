package com.ty.factory.simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Car car = CarFactory.createAudi();
        car.getName();
    }
}
