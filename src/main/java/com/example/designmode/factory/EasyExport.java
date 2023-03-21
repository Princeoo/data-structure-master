package com.example.designmode.factory;

import org.springframework.stereotype.Service;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/3/21 15:42
 */
@Service
public class EasyExport implements Common {
    @Override
    public void export() {
        System.out.println("easy");
    }
}
