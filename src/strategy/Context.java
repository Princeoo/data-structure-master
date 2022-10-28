package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2022/5/31 15:51
 */
public class Context {
    public interface ShareStrategy {
        // ����������ִ�з���
        void shareAlgorithm(String param);
    }

    public class OrderItemShare implements ShareStrategy {
        @Override
        public void shareAlgorithm(String param) {
            System.out.println("��ǰ����ͼƬ��" + param);
        }
    }

// ʡ�� MultiItemShare�Լ�SingleItemShare����

    // ������
//    public class ShareFactory {
//        // �������ö��
//        enum ShareType {
//            SINGLE("single", "����Ʒ"),
//            MULTI("multi", "����Ʒ"),
//            ORDER("order", "�µ�");
//            // ������Ӧ�ı���
//            private String code;
//
//            // ҵ�񳡾�����
//            private String desc;
//            ShareType(String code, String desc) {
//                this.code = code;
//                this.desc = desc;
//            }
//            public String getCode() {
//                return code;
//            }
//            // ʡ�� get set ����
//        }
//        // �������map����
//        private static final Map<String, ShareStrategy> shareStrategies = new       HashMap<>();
//        static {
//            shareStrategies.put("order", new OrderItemShare());
//            shareStrategies.put("single", new SingleItemShare());
//            shareStrategies.put("multi", new MultiItemShare());
//        }
//        // ��ȡָ������
//        public static ShareStrategy getShareStrategy(String type) {
//            if (type == null || type.isEmpty()) {
//                throw new IllegalArgumentException("type should not be empty.");
//            }
//            return shareStrategies.get(type);
//        }
//
//        public static void main(String[] args) {
//            // ����demo
//            String shareType = "order";
//            ShareStrategy shareStrategy = ShareFactory.getShareStrategy(shareType);
//            shareStrategy.shareAlgorithm("order");
//            // ����������ǰ����ͼƬ��order
//        }
//    }
}
