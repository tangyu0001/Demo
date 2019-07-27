package com.ty.singleton;

public class DoubleCheckSingleton {

    private static DoubleCheckSingleton INSTANCE = null; //加入volatile

    private DoubleCheckSingleton(){}

    public DoubleCheckSingleton getINSTANCE(){
        if (INSTANCE == null){
            synchronized (DoubleCheckSingleton.class){
                if (INSTANCE==null){
                    INSTANCE = new DoubleCheckSingleton();

                    // 1 分配内存给对象
                    // 2 初始化对象
                    // 3 把对象赋值给INSTANCE
                    // 会导致指令重排序  先复制给INSTANCE 再 初始化对象 这时第一个线程释放锁 第二个线程进入 判断INSTANCE 不为空 但是没有出初始化就返回了 会有问题
                    // 需要将INSTANCE 加上 volatile 禁止指令重排序
                }
            }
            //释放锁之后
        }
        return INSTANCE;
    }

}
