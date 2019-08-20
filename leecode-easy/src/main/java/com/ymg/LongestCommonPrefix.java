package com.ymg;

/**
 * @author yumg
 * @create 2019/08/07
 * @desc Leetcode 14
 * @since 1.0.0
 **/
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strArray = {"aa","a"};
        System.out.println(getLongestCommonPrefix(strArray));
    }

    private static String getLongestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        int i = 1;
        while (i<strs.length){
            while (strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length() -1);
            }
            i++;
        }
        return pre;
    }
}
