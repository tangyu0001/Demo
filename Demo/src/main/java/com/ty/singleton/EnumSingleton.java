package com.ty.singleton;

public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData(){
        return data;
    }

    EnumSingleton(){

    }

    public void setData(Object data){
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
