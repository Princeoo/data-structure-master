package com.example.designmode.observation;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:58
 */
public class test {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        // �������������
        FriendOneObserver oneObserver = new FriendOneObserver();
        subject.attach(oneObserver);
        FriendTwoObserver twoObserver = new FriendTwoObserver();
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

