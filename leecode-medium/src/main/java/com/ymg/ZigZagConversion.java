package com.ymg;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yumg
 * @create 2019/07/31
 * @desc leecode 6
 * @since 1.0.0
 **/
public class ZigZagConversion {

    public static void main(String[] args) {
        System.out.println(convert("ABCDEFGHIGK",3));
    }

    public static String convert(String s,int nRows){
        char c[] = s.toCharArray();
        int len = s.length();
        List<StringBuilder> stringBuilders = new ArrayList<>();
        for (int i = 0; i < nRows; i++) {
            stringBuilders.add(new StringBuilder());
        }
        int i = 0;
        boolean flag = false;
        int temp = 0;
        while (i<len){
            if (i == 0 || i==len || (temp+1)/nRows==1 || temp==0){
                flag = !flag;
            }
            System.out.println(i);
            stringBuilders.get(temp).append(s.charAt(i));
            temp+= flag?1:-1;
            i++;
        }

        StringBuilder strSB = new StringBuilder();
        for (StringBuilder sb:stringBuilders){
            strSB.append(sb);
        }
        return strSB.toString();

    }

}
