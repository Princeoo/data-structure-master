package designmode.observation;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:49
 */
public class ConcreteSubject implements Subject {

    // ����������
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        // ��Ӷ��Ĺ�ϵ
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // �Ƴ����Ĺ�ϵ
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // ֪ͨ��������
        for (Observer observer : observers) {
//            observer.update(message);
        }
    }
}
