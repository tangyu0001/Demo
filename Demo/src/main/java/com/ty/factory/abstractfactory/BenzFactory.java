package com.ty.factory.abstractfactory;

public class BenzFactory implements AbstractFactory {
    public Object createEVCar() {
        return new BenzEV();
    }

    public Object createMotorBike() {
        return null;
    }

    public Object createMotorCar() {
        return null;
    }
}
