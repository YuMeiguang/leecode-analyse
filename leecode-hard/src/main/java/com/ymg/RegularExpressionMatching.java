package com.ymg;

/**
 * @author yumg
 * @create 2019/08/06
 * @desc leecode 10
 * @since 1.0.0
 **/
public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa","a"));
        System.out.println(isMatch("aa","a*"));
        System.out.println(isMatch("ab",".*"));
        System.out.println(isMatch("aab","c*a*b"));
        System.out.println(isMatch("mississippi","mis*is*p*."));
    }


    public static boolean isMatch(String str, String regex) {
        boolean[][] dp = new boolean[str.length() + 1][regex.length() + 1];
        dp[0][0] = true;
        for(int i = 1; i < regex.length() + 1; i++) {
            if(regex.charAt(i - 1) == '*') {
                dp[0][i] = dp[0][i-2];
            }
        }

        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                if(match(str.charAt(i-1), regex.charAt(j-1))) {
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    if(regex.charAt(j-1) == '*') {
                        dp[i][j] = dp[i][j-2];
                        if(match(str.charAt(i-1), regex.charAt(j-2))) {
                            dp[i][j] |= dp[i-1][j];
                        }
                    }
                }
            }
        }

        return dp[str.length()][regex.length()];
    }

    private static boolean match(char c1, char r) {
        return c1 == r || r == '.';
    }


}
