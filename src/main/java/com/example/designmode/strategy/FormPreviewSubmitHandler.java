package com.example.designmode.strategy;

import com.example.common.RV;
import com.example.common.ResultVO;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.Serializable;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/11/7 16:35
 */
public class FormPreviewSubmitHandler implements FormSubmitHandler<Serializable> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getSubmitType() { return "preview"; }

    @Override
    public ResultVO<String> handleSubmit(FormSubmitRequest request) {
        logger.debug("预览模式提交：userId={}, formInput={}", request.getUserId(), request.getFormInput());
        return RV.success("预览模式提交数据成功！");
    }
}