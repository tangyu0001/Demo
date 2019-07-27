package com.ty.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {



    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

        LazySingletonNosafe sin = LazySingletonNosafe.getInstence();
        LazySingletonNosafe sin1 = LazySingletonNosafe.getInstence();
        LazySingletonNosafe sin2 = LazySingletonNosafe.getInstence();


        Class clazz = LazySingletonNosafe.class;

        Constructor con = clazz.getDeclaredConstructor(null);
        con.setAccessible(true);



    }


}
