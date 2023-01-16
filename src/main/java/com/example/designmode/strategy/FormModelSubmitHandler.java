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
        logger.debug("ģ���ύ��userId={}, formInput={}", request.getUserId(), request.getFormInput());

        // ģ�ʹ����ɹ�����ģ�͵� id
        Long modelId = createModel(request);

        return RV.success("ģ���ύ�ɹ���" + modelId);
    }

    private Long createModel(FormSubmitRequest request) {
        // ����ģ�͵��߼�
        return 123L;
    }
}