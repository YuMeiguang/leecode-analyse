package com.ymg;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yumg
 * @create 2019/08/15
 * @desc Leetcode 22
 * @since 1.0.0
 **/
public class GenerateParentheses {

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        System.out.println(list);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        get("",result,n,n);
        return result;
    }

    public static void get(String list,List<String> result,int left,int right) {
        if(left == 0 && right == 0) {
            result.add(list);
            return;
        }
        if(left > 0) {
            get(list+"(",result,left-1,right);
        }
        if(right > left) {
            get(list+")",result,left,right-1);
        }
    }



}
