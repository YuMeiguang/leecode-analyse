package com.ymg;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yumg
 * @create 2019/07/25
 * @desc  leecode 1
 * @since 1.0.0
 * @example Given nums = [2, 7, 11, 15], target = 9
 * 每个元素不能使用两次
 **/
public class TwoSum {

    public static void main(String[] args) {
        int[] condition = {3,6,8,2,9,7,1};
        int[] result = twoSum(condition,10);
        System.out.println(result[0]+" "+result[1]);
    }

    public static int[] twoSum(int[] numbers,int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>(16);
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])){
                result[0] = map.get(target-numbers[i]);
                result[1] = i+1;
                return result;
            }
            map.put(numbers[i],i+1);
        }

        return result;
    }


}
