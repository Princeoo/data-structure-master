package designmode.observation;

import java.util.Observer;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:47
 */
public interface Subject {
    // 添加订阅关系
    void attach(Observer observer);
    // 移除订阅关系
    void detach(Observer observer);
    // 通知订阅者
    void notifyObservers(String message);
}
