package template;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 14:29
 */
public  class MyWriteArticle extends WriteArticle {

    // ǰ��
    @Override
    public void introduction() {
        System.out.println("ֻ�й�ͷ���ܱ�ǿ");
    }

    // ���
    @Override
    public void theLast() {
        System.out.println("��ע�ҵĹ��ںţ�Java3y");

    }
    @Override
    protected void actualContent() {
        System.out.println("��Һã�����3y������������ҷ�����д��ģ�巽��ģʽ");
    }

}
