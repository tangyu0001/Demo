package com.ty.factory.factorymethod;

public class BMWFactory implements IMethodFacory<Car> {
    public Car create() {
        return new BMW();
    }
}
