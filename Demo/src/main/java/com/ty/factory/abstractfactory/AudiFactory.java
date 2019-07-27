package com.ty.factory.abstractfactory;

public class AudiFactory implements AbstractFactory<Car>{
    public Car createEVCar() {
        return new AudiEV();
    }

    public Car createMotorBike() {
        return new AudiMotorBike();
    }

    public Car createMotorCar() {
        return new AudiMotorCar();
    }
}
