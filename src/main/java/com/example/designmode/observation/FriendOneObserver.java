package com.example.designmode.observation;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:58
 */
public class FriendOneObserver implements Observer {

    @Override
    public void update(String message) {
        // 模拟处理业务逻辑
        System.out.println("FriendOne 知道了你发动态了" + message);
    }
}
