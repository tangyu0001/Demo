package com.ty.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {



    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

//        LazySingletonNosafe sin = LazySingletonNosafe.getInstence();
//        LazySingletonNosafe sin1 = LazySingletonNosafe.getInstence();
//        LazySingletonNosafe sin2 = LazySingletonNosafe.getInstence();


//        Class clazz = LazySingletonNosafe.class;
//
//        Constructor con = clazz.getDeclaredConstructor(null);
//        con.setAccessible(true);
//
//        LazySingletonNosafe sin1 = (LazySingletonNosafe) con.newInstance();
//        System.out.println(sin );
//        System.out.println(sin1 );
//        System.out.println(sin2 );

            EnumTest e = EnumTest.THREE;
        System.out.println(e.toString());
        System.out.println(e.ordinal());
    }


}
