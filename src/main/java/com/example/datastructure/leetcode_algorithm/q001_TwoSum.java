package com.example.datastructure.leetcode_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
        Given an datastructure.array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution.

        Given nums = [2, 7, 11, 15], target = 9,
        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].
*/

public class q001_TwoSum {

    public static void main(String[] args){
        int[] array = new int[]{1 , 3 , 4 , 2 , 5 , 7};
        System.out.println(Arrays.toString(solutionHaHa1(array , 9)));
        System.out.println(Arrays.toString(solutionHaHa2(array , 9)));
        System.out.println(Arrays.toString(solution3(array , 9)));
    }

    public static int[] solutionHaHa1(int[] nums , int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] solutionHaHa2(int[] nums , int target) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (hashMap.containsKey(value)){
                return new int[]{i,hashMap.get(value)};
            }
        }
        return null;
    }


    /**
     * 解法1(个人解法)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution1(int[] nums , int target){
        for(int i = 0;i<nums.length;i++){
            for(int j=  i+1;j<nums.length;j++){
                if(nums[i] == target-nums[j]){
                    return new int[]{i , j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 解法2
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution2(int[] nums , int target){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            map.put(nums[i] , i);
        }
        for(int i = 0;i<nums.length;i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i , map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 解法3
     * @param nums 1 , 3 , 4 , 2 , 5 , 7
     * @param target 9
     * @return
     */
    public static int[] solution3(int[] nums , int target){
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement) , i};
            }
            map.put(nums[i] , i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
