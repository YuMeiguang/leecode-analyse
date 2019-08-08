package com.ymg;

/**
 * @author yumg
 * @create 2019/08/06
 * @desc leecode 12
 * @since 1.0.0
 **/
public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(integerToRoman(1994));
    }

    public static String integerToRoman(int num){
        String[] M = {"","M","MM","MMM"};
        String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] X = {"","X","XX","XXX","LX","X","LX","LXX","LXXX","XC"};
        String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[(num%10)];

    }
}
