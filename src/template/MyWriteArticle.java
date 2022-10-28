package template;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 14:29
 */
public  class MyWriteArticle extends WriteArticle {

    // 前言
    @Override
    public void introduction() {
        System.out.println("只有光头才能变强");
    }

    // 最后
    @Override
    public void theLast() {
        System.out.println("关注我的公众号：Java3y");

    }
    @Override
    protected void actualContent() {
        System.out.println("大家好，我是3y，今天来给大家分享我写的模板方法模式");
    }

}
