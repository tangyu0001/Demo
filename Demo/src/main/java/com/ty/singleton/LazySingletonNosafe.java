package com.ty.singleton;

/**
 * 饿汉式 调用时才new 但是线程不安全
 */
public class LazySingletonNosafe {

    private  static LazySingletonNosafe INSTENCE = null;

   // private static int count = 0;

    private static boolean flag = false;

    private  LazySingletonNosafe(){
        if(!flag){
            throw new RuntimeException("反射不允许初始化对象");
        }
       // count++;
    }

    /**
     * static 防止子类重写
     * @return
     */
    public static final LazySingletonNosafe getInstence(){
        if (INSTENCE==null){
            flag = true;
            INSTENCE = new LazySingletonNosafe();
        }
        return INSTENCE;
    }
}
