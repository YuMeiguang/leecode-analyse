package com.ymg;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yumg
 * @create 2020/10/09
 * @desc
 * @since 1.0.0
 **/
public class E1 {

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> hashMap = new HashMap<>(16);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                result[0] = hashMap.get(nums[i]);
                result[1] = i;
                return result;
            }else{
                hashMap.put(target-nums[i],i);
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5};
        System.out.printf(twoSum(nums,4)[0]+"===="+twoSum(nums,4)[1]+"");
    }
}
