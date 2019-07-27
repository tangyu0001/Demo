package com.ty.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IMethodFacory f = new BenzFactory();
        Car car = (Car) f.create();
        car.getName();
    }
}
