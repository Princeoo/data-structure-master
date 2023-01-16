package com.example.designmode.strategy;

import com.example.common.ResultVO;

import java.io.Serializable;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/1/16 16:54
 */
public interface FormService {

    ResultVO<String, Serializable> submitForm(FormSubmitRequest request);

}
