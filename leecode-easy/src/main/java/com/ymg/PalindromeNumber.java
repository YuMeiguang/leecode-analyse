package com.ymg;

/**
 * @author yumg
 * @create 2019/08/01
 * @desc Leetcode 9
 * @since 1.0.0
 **/
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(palindromeNumber(-121));
    }

    public static Boolean palindromeNumber(Integer number){
        int temp ;
        if (number <0){
            return false;
        }
        int result = 0;
        int tempNumber = number;
        while (number>=1){
            temp = number %10;
            result = result*10+temp;
            number = number/10;
        }

        return tempNumber == result;
    }
}
