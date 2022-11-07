package com.example.designmode.template;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 14:28
 */

// ͨ��ģ��
public abstract class WriteArticle {

    // ÿ���˵ġ�ǰ�ԡ�����һ�������Գ���(abstract)
    protected abstract void introduction();

    // ÿ���˵ġ���󡱶���һ�������Գ���(abstract)
    protected abstract void theLast();


    // ʵ��Ҫд�����ݣ�ÿ���˵ġ�ʵ�����ݡ�����һ�������Գ���(abstract)
    protected abstract void actualContent();

    // дһƪ����������(Ϊ�˷�����ã����ǽ��⼸�������װ��һ������)
    public final void writeAnCompleteArticle() {

        // ǰ��
        introduction();

        // ʵ������
        actualContent();

        // ���
        theLast();
    }
}

