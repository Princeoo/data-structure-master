package com.example.designmode.singleton;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/4/11 16:26
 */
public class Singleton {
    // 使用 volatile 关键字保证可见性和禁止指令重排序
    private static volatile Singleton instance;

    // 私有构造函数，避免通过 new 关键字创建新的实例
    private Singleton() {}

    public static Singleton getInstance() {
        // 双重校验锁
        if (instance == null) {
            synchronized (Singleton.class) {//双重检验锁是提高性能问题，锁前多一次instance判断，就不需要每次线程都锁，还能防止并发问题
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //在上述代码中，Singleton 类只能实例化一次，通过 getInstance() 方法获取该实例。第一次调用 getInstance() 时会检查是否已经存在一个实例，如果不存在，则创建它。
    // 由于锁是加在同步代码块上的，因此只有在需要创建类实例对象的情况下才会执行同步操作，避免了无用的同步开销。
    //虽然该实现方式比较安全，但并不是所有情况下都适用。例如，在涉及反射或序列化时，可能无法保证单例模式的唯一性，因此在使用时应该结合具体的场景和功能需求选择相应的实现方式来保证其正确性和可靠性。
}
