package com.example.designmode.strategy;

import com.example.common.RV;
import com.example.common.ResultVO;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/11/7 16:38
 */
public class FormModelSubmitHandler implements FormSubmitHandler<Long> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getSubmitType() {
        return "model";
    }

    @Override
    public ResultVO<String, Long> handleSubmit(FormSubmitRequest request) {
        logger.debug("模型提交：userId={}, formInput={}", request.getUserId(), request.getFormInput());

        // 模型创建成功后获得模型的 id
        Long modelId = createModel(request);

        return RV.success("模型提交成功！" + modelId);
    }

    private Long createModel(FormSubmitRequest request) {
        // 创建模型的逻辑
        return 123L;
    }
}