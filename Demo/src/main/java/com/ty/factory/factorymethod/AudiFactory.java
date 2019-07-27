package com.ty.factory.factorymethod;

public class AudiFactory implements IMethodFacory<Car> {
    public Car create() {
        return new Audi();
    }
}
