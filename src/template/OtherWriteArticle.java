package template;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/6/8 14:31
 */

// 3yŮ���ѵ�����ģ��
public  class OtherWriteArticle extends WriteArticle {

    // ǰ��
    @Override
    public void introduction() {
        System.out.println("balabalabalalabalablablalab");
    }

    // ���
    @Override
    public void theLast() {
        System.out.println("balabalabalalabalablablalab");

    }

    @Override
    protected void actualContent() {
        System.out.println("3y��ɵ�ӣ����ù���");
    }
}

