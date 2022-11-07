package com.example.designmode.observation;


/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:47
 */
public interface Subject {
    // ��Ӷ��Ĺ�ϵ
    void attach(Observer observer);
    // �Ƴ����Ĺ�ϵ
    void detach(Observer observer);
    // ֪ͨ������
    void notifyObservers(String message);
}
