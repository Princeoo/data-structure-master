package com.example.datastructure.leetcode_algorithm;

/**
Given a sorted datastructure.array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

        You may assume no duplicates in the datastructure.array.

        Here are few examples.

 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0

*/


public class q035_SearchInsertPosition {

    public static void main(String[] args) {
//        System.out.println(new q035_SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(new q035_SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 2));
//        System.out.println(new q035_SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 7));
//        System.out.println(new q035_SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0));
//
//
//        System.out.println(new q035_SearchInsertPosition().searchInsert1(new int[]{1, 3, 5, 6}, 5));
//        System.out.println(new q035_SearchInsertPosition().searchInsert1(new int[]{1, 3, 5, 6}, 2));
//        System.out.println(new q035_SearchInsertPosition().searchInsert1(new int[]{1, 3, 5, 6}, 7));
//        System.out.println(new q035_SearchInsertPosition().searchInsert1(new int[]{1, 3, 5, 6}, 0));


    }


    /**
     * 解法1 (个人解法)
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) return i;
        }
        return nums.length;
    }


    /**
     * 解法2(推荐解法)
     * @param nums 数组
     * @param target 目标值
     * @return
     */
    public int searchInsert1(int[] nums , int target){
        int low = 0 , high = nums.length - 1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid + 1;
        }
        return low;
    }
}
