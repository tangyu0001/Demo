package com.ty.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例
 */
public class HungrySingleton implements Serializable{

    private static  final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }


}
