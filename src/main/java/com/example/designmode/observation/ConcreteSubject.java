package com.example.designmode.observation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:49
 */
public class ConcreteSubject implements Subject {

    // 订阅者容器
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        // 添加订阅关系
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // 移除订阅关系
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // 通知订阅者们
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
