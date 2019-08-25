package com.ymg;


/**
 * @author yumg
 * @create 2019/08/24
 * @desc Leetcode 26
 * @since 1.0.0
 **/
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,1,1,2,3,4,4,4,5,6};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        int i = 0;
        for (int n:nums){
            if (i == 0 || n>nums[i -1]){
                nums[i++] = n;
            }
        }
        return i;
    }
}
