package com.example.designmode.observation;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:58
 */
public class test {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        // 添加两个订阅者
        FriendOneObserver oneObserver = new FriendOneObserver();
        subject.attach(oneObserver);
        FriendTwoObserver twoObserver = new FriendTwoObserver();
        subject.attach(twoObserver);

        // 发送朋友圈动态
        subject.notifyObservers("第一个朋友圈消息");
        // 输出结果： FriendOne 知道了你发动态了第一个朋友圈消息
        //          FriendTwo 知道了你发动态了第一个朋友圈消息

        // 这里发现 twoObserver 是个推荐卖茶叶的，删除好友
        subject.detach(twoObserver);
        subject.notifyObservers("第二个朋友圈消息");
        // 输出结果：FriendOne 知道了你发动态了第二个朋友圈消息
    }
}

