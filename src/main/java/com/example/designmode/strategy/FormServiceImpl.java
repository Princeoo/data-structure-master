package com.example.designmode.strategy;

import com.example.common.RV;
import com.example.common.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/1/16 16:53
 */

@Service
public class FormServiceImpl implements FormService {

    @Autowired
    private FormSubmitHandlerFactory submitHandlerFactory;

    @Override
    public ResultVO<String, Serializable> submitForm(FormSubmitRequest request) {
        String submitType = request.getSubmitType();

        // 根据 submitType 找到对应的提交处理器
        FormSubmitHandler<Serializable> submitHandler = submitHandlerFactory.getHandler(submitType);

        // 判断 submitType 对应的 handler 是否存在
        if (submitHandler == null) {
            return RV.fail("非法的提交类型: " + submitType);
        }

        // 处理提交
        return submitHandler.handleSubmit(request);
    }
}
