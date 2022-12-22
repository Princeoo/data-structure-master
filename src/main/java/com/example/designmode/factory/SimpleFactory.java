package com.example.designmode.factory;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/12/12 16:32
 */
public class SimpleFactory {

    public static void main(String[] args) {
        ProductFactory product = createProduct("ProductA");
        product.content();
    }

    public static ProductFactory createProduct(String value){
        //简单工厂 直接根据value返回具体需要的类
//        if ("ProductC".equals(value)){
//            return new ProductC();
//        }else if ("ProductD".equals(value)){
//            return new ProductD();
//        }
        //工厂模式 简单工厂的基础上 把类在抽象一层（叫做工厂），在抽象的工厂中返回具体的类
        if ("ProductA".equals(value)){
            return new ProductAFactory();
        }else if ("ProductB".equals(value)){
            return new ProductBFactory();
        }
        return null;
    }

    public static class ProductAFactory implements ProductFactory {
        @Override
        public Product createParser() {
            return new ProductA();
        }
    }

    public static class ProductBFactory implements ProductFactory {
        @Override
        public Product createParser() {
            return new ProductB();
        }
    }

    public static class ProductA implements Product {

    }

    public static class ProductB implements Product {

    }

    public static class ProductC{

    }

    public static class ProductD{

    }
}
