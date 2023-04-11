package com.example.designmode.singleton;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/4/11 16:35
 */
public class SingletonInteriorStatic {
    private SingletonInteriorStatic() {}

    private static class SingletonHolder {
        private static final SingletonInteriorStatic instance = new SingletonInteriorStatic();
    }

    //3.内部静态类：利用类的加载机制，在类加载时自动执行静态内部类的初始化操作，由 Java 虚拟机保证线程安全性。
    public static SingletonInteriorStatic getInstance() {
        return SingletonHolder.instance;
    }
}
