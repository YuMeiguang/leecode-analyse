package com.ymg;

/**
 * @author yumg
 * @create 2019/08/25
 * @desc  Leetcode 35
 * @since 1.0.0
 **/
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6};
        System.out.println(searchInsert(nums,3));
    }

    public static int searchInsert(int[] nums, int target){
        int s =0,e = nums.length -1;
        while (s<e){
            int m = (s+e)/2;
            if (nums[m]>target){
                e = m;
            }else if(nums[m]<target){
                s = m +1;
            }else{
                return m;
            }
        }
        return target>nums[s] ? s+1:s;
    }
}
