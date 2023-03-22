package com.example.designmode.factory;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/3/21 15:47
 */
public class Factory {

    public static Common getService(Integer type) {
        if (type.equals(1)) {
            return new EasyExport();
        } else if (type.equals(2)) {
            return new DifficultyExport();
        }   else{
            throw new RuntimeException("Message type:" + type + " not support");
        }
    }

}
