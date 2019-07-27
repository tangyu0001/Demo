package com.ty.factory.simplefactory;

public class CarFactory {


    public static Car create(Class<Audi> clazz){
        try {
            if(clazz !=null){
                return clazz.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
