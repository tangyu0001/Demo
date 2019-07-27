package com.ty.factory.simplefactory;

public class CarFactory {


    public static Car createAudi(){
        return new Audi();
    }

    public static Car createBenz(){
        return new Benz();
    }

    public static Car createBMW(){
        return new BMW();
    }
}
