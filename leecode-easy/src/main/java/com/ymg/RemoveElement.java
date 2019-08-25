package com.ymg;

/**
 * @author yumg
 * @create 2019/08/24
 * @desc Leetcode 27
 * @since 1.0.0
 **/
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 2, 3, 4, 4, 4, 5, 6};
        System.out.println(nums.length);
        System.out.println(removeElement(nums, 4));

    }

    public static int removeElement(int[] nums,int elem){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != elem){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
