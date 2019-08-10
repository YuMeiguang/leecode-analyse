package com.ymg;

import java.util.Stack;

/**
 * @author yumg
 * @create 2019/08/08
 * @desc leecode 20
 * @since 1.0.0
 **/
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }

    public static Boolean isValid(String s){
        Stack<Character> stack = new Stack();
        for (char c:s.toCharArray()){
            if ('(' == c){
                stack.push(')');
            }else if ('[' == c){
                stack.push(']');
            }else if (('{' == c)){
                stack.push('}');
            }else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }

}
