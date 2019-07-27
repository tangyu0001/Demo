package com.ty.factory.factorymethod;

public class BenzFactory implements IMethodFacory<Car> {
    public Car create() {
        return new Benz();
    }
}
