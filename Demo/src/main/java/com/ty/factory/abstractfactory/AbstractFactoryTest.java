package com.ty.factory.abstractfactory;

public class AbstractFactoryTest {


    public static void main(String[] args) {
        AbstractFactory factory = new AudiFactory();
        Car car = (Car) factory.createEVCar();
        car.getName();
    }
}
