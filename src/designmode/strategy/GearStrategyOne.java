package designmode.strategy;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/5/31 15:50
 */
public class GearStrategyOne implements GearStrategy {

    @Override
    public void algorithm(String param) {
        System.out.println("µ±Ç°µµÎ»" + param);
    }
}
