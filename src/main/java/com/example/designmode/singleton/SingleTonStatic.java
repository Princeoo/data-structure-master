package com.example.designmode.singleton;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/4/11 16:33
 */
public class SingleTonStatic {

    private static final SingleTonStatic instance = new SingleTonStatic();

    private SingleTonStatic() {}

    //除了双重校验锁，还有其他实现单例模式的方式。下面列举一些常见的方式：
    //1.静态初始化：将实例属性定义为静态属性，同时在类加载时进行初始化。此种方式适用于实例对象创建比较简单，且明确需要使用单例模式的情况。
    public static SingleTonStatic getInstance() {
        return instance;
    }

}
