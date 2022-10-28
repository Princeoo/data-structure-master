package lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/9 16:05
 */
//JDKÔ´Âë
public class TestReentrantLock {
    private static volatile int i = 0;

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        //synchronized (TestReentrantLock.class) {
        i++;
        //}
        lock.unlock();
    }
}