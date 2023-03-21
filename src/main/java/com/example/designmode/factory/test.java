package com.example.designmode.factory;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/3/21 15:44
 */
public class test {

    @Autowired
    Common common;

    public static void doExport(){
        Factory.getService(1).export();
    }

    public static void main(String[] args) {
        doExport();
    }

}
