package com.example.designmode.strategy;


import com.example.common.ResultVO;

import java.io.Serializable;

/**
 * ���ύ������
 */
public interface FormSubmitHandler<R extends Serializable> {

    /**
     * ����ύ���ͣ�����ֵҲ����ʹ���Ѿ����ڵ�ö���ࣩ
     *
     * @return �ύ����
     */
    String getSubmitType();

    /**
     * ������ύ����
     *
     * @param request ����
     * @return ��Ӧ��left Ϊ���ظ�ǰ�˵���ʾ��Ϣ��right Ϊҵ��ֵ
     */
    ResultVO<String, R> handleSubmit(FormSubmitRequest request);
}
