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

    /**
     * 策略模式和工厂模式其实一样，只要把submitHandler.handleSubmit(request);删除 直接返回submitHandler，就是工厂模式了
     * 策略模式属于行为型模式，而工厂模式属于创建型模式
     * 侧重点不一样，工厂模式主要是返回的接口实现类的实例化对象（关注对象的创建），而策略模式是在实例化策略模式的时候已经创建好（关注对象的封装）。
     * @param request
     * @return
     */
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
