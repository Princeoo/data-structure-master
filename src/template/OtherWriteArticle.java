package template;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 14:31
 */

// 3y女朋友的文章模板
public  class OtherWriteArticle extends WriteArticle {

    // 前言
    @Override
    public void introduction() {
        System.out.println("balabalabalalabalablablalab");
    }

    // 最后
    @Override
    public void theLast() {
        System.out.println("balabalabalalabalablablalab");

    }

    @Override
    protected void actualContent() {
        System.out.println("3y是傻子，不用管他");
    }
}

