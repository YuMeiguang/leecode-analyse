package com.ymg;

/**
 * @author yumg
 * @create 2019/08/01
 * @desc leetcode 8
 * @since 1.0.0
 **/
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(218));
    }

    public static Integer reverse(Integer x){
        boolean negativeFlag = false;
        if (x<0){
            negativeFlag = true;
            x = -x;
        }
        int temp = 0;
        int y = 0;
        while (x>=1){
            temp = x%10;
            y = y*10+temp;
            x = x/10;
        }
        if (negativeFlag){
            y = -y;
        }
        return y;
    }
}
