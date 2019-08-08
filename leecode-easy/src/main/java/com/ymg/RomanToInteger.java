package com.ymg;

/**
 * @author yumg
 * @create 2019/08/07
 * @desc leecode 13
 * @since 1.0.0
 * 字符  数值
 * I    1
 * V    5
 * X    10
 * L    50
 * C    100
 * D    500
 * M    1000
 **/
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInteger("MCMXCIV"));
    }

    public static int romanToInteger(String s){
        int res = 0;
        for (int i=s.length()-1;i>=0;i--){
            switch (s.charAt(i)){
                case 'I':
                    res += (res>=5)?-1:1;
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += (res>=50)?-10:10;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += (res>=500)?-100:100;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
                default:
                    break;
            }
        }
        return res;
    }
}
