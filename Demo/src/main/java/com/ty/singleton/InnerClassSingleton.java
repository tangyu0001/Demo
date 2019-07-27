package com.ty.singleton;

/**
 * 静态内部类内部类 单例  线程安全 静态内部类 只有使用该类时才会初始化 外部类初始化时 静态内部类不会初始化
 */
public class InnerClassSingleton {

    private static InnerClassSingleton INSTANS = null;
    private InnerClassSingleton(){}

    public InnerClassSingleton getINSTANS(){
        return InitSingleTon.SINGLETON;
    }

    static class InitSingleTon{
        public  static InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }

}
