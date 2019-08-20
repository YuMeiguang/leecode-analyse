package com.ymg;

import java.util.HashMap;

/**
 * @author yumg
 * @create 2019/07/26
 * @desc Leetcode 3
 * @since 1.0.0
 * TODO 难度
 **/
public class LongestSubstringWithoutRepeatingCharacters {
    public LongestSubstringWithoutRepeatingCharacters() {
    }

    public static void main(String[] args) {
        String sourceStr = "abcabcbb";
        System.out.println(getLength(sourceStr));
    }

    private static Integer getLength(String sourceStr) {
        if (sourceStr.length() == 0){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0,j=0; i < sourceStr.length(); i++) {
            if (map.containsKey(sourceStr.charAt(i))){
                j = Math.max(j,map.get(sourceStr.charAt(i)) +i);
            }
            map.put(sourceStr.charAt(i),i);
            max = Math.max(max,i-j+1);
        }

        return max;
    }
}
