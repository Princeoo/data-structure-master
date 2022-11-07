package com.example.designmode.template;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 14:28
 */

// 通用模板
public abstract class WriteArticle {

    // 每个人的“前言”都不一样，所以抽象(abstract)
    protected abstract void introduction();

    // 每个人的“最后”都不一样，所以抽象(abstract)
    protected abstract void theLast();


    // 实际要写的内容，每个人的“实际内容”都不一样，所以抽象(abstract)
    protected abstract void actualContent();

    // 写一篇完整的文章(为了方便调用，我们将这几个步骤分装成一个方法)
    public final void writeAnCompleteArticle() {

        // 前言
        introduction();

        // 实际内容
        actualContent();

        // 最后
        theLast();
    }
}

