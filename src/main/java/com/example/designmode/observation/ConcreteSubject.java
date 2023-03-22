package com.example.designmode.observation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:49
 */
public class ConcreteSubject implements Subject {

    // ����������
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        // ��Ӷ��Ĺ�ϵ
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // �Ƴ����Ĺ�ϵ
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // ֪ͨ��������
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
