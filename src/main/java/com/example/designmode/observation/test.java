package com.example.designmode.observation;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:58
 */
public class test {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        // �����������Ӻ���
        FriendOneObserver oneObserver = new FriendOneObserver();
        subject.attach(oneObserver);
        FriendOneObserver twoObserver = new FriendOneObserver();
        subject.attach(twoObserver);

        // ��������Ȧ��̬
        subject.notifyObservers("��һ������Ȧ��Ϣ");
        // �������� FriendOne ֪�����㷢��̬�˵�һ������Ȧ��Ϣ
        //          FriendTwo ֪�����㷢��̬�˵�һ������Ȧ��Ϣ

        // ���﷢�� twoObserver �Ǹ��Ƽ�����Ҷ�ģ�ɾ������
        subject.detach(twoObserver);
        subject.notifyObservers("�ڶ�������Ȧ��Ϣ");
        // ��������FriendOne ֪�����㷢��̬�˵ڶ�������Ȧ��Ϣ
    }
}

