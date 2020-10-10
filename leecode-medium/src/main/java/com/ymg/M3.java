package com.ymg;

import java.util.HashMap;

/**
 * @author yumg
 * @create 2020/10/09
 * @desc
 * @since 1.0.0
 **/
public class M3 {

    public static int lengthOfLongestSubstring(String s){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int i = 0;
        int max = 0;
        char[] arr = s.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            if ( hashMap.containsKey(arr[j])){
                i = Math.max(i,hashMap.get(arr[j])+1);
            }
            hashMap.put(arr[j],j);
            max = Math.max(max,j-i+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("asdahakkkasdana"));
    }
}
