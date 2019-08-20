package com.ymg;

/**
 * @author yumg
 * @create 2019/08/01
 * @desc Leetcode 7
 * @since 1.0.0
 **/
public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(toInteger("    -1210asd"));
    }

    public static int toInteger(String str){
        int index = 0,sign = 1,total = 0;
        if (str.length() == 0){
            return 0;
        }

        while (str.charAt(index)==' ' && index<str.length()){
            index ++;
        }

        if (str.charAt(index) == '-' || str.charAt(index) == '+'){
            sign = str.charAt(index) == '+'?1:-1;
            index ++;
        }

        while (index < str.length()){
            int digit = str.charAt(index) - '0';
            if (digit<0 || digit>9){
                break;
            }
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total*10+digit;
            index ++;
        }

        if (sign==-1){
            total = -total;
        }
        return total;

    }

}
