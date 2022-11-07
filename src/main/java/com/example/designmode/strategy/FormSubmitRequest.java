package com.example.designmode.strategy;

import java.util.Map;

/**
 * ���ύ������
 */
public class FormSubmitRequest {

    /**
     * �ύ����
     */
    private String submitType;

    /**
     * �û� id
     */
    private Long userId;

    /**
     * ���ύ��ֵ
     */
    private Map<String, Object> formInput;

    // ��������


    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Map<String, Object> getFormInput() {
        return formInput;
    }

    public void setFormInput(Map<String, Object> formInput) {
        this.formInput = formInput;
    }
}