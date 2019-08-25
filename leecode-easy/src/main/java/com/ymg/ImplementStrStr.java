package com.ymg;

/**
 * @author yumg
 * @create 2019/08/25
 * @desc Leetcode18
 * @since 1.0.0
 **/
public class ImplementStrStr {

    public static void main(String[] args) {
        String hayStack = "hello";
        String needle = "ll";

        System.out.println( strStr(hayStack,needle));

    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }

        if (haystack.length() == 0){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (i+needle.length()>haystack.length()){
                break;
            }

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
                if (j == needle.length() -1){
                    return i;
                }
                
            }
            
        }



        return -1;
    }

}
