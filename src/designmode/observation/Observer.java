package designmode.observation;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 15:58
 */
public interface Observer {
    // 处理业务逻辑
    void update(String message);
}
