package com.example.designmode.singleton;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/4/11 16:34
 */
public enum SingletonEnum {
    INSTANCE;

    //2.枚举类型：枚举类型保证了只能实例化一次，而且枚举类型的创建是线程安全的，具有天然的单例特性。
    public void doSomething() {
        // ...
    }
}

