package datastructure.leetcode_algorithm;

/**

Find the contiguous subarray within an datastructure.array (containing at least one number) which has the largest sum.

        For example, given the datastructure.array [-2,1,-3,4,-1,2,1,-5,4],
        the contiguous subarray [4,-1,2,1] has the largest sum = 6.

*/

public class q053_MaximunSubarray {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new q053_MaximunSubarray().maxSubArray(nums));
        System.out.println(new q053_MaximunSubarray().maxSubArray(new int[]{-1}));
        System.out.println(new q053_MaximunSubarray().maxSubArray(new int[]{-3, 1, -2}));
    }

    /**
     * �ⷨ1(�Ƽ��ⷨ)
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        //dp[i] ��ʾ���� nums[ i]��β�����������������
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        } // Ҳ���������������ͬʱ��� res �����ֵ����������Ϊ�����������ֿ�д����ҿ�������ѡ��
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }


}
