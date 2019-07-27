package com.ty.factory.abstractfactory;

public interface AbstractFactory<T> {


    public T createEVCar();

    public T createMotorBike();

    public T createMotorCar();

}
