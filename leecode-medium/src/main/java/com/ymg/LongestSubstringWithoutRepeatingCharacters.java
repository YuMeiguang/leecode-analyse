package com.ymg;

import java.util.HashMap;

/**
 * @author yumg
 * @create 2019/07/26
 * @desc
 * @since 1.0.0
 **/
public class LongestSubstringWithoutRepeatingCharacters {
    public LongestSubstringWithoutRepeatingCharacters() {
    }

    public static void main(String[] args) {
        String sourceStr = "abcabcbb";
        System.out.println();
        System.out.println(getLength(sourceStr));
    }

    private static Integer getLength(String sourceStr) {
        char[] characters = sourceStr.toCharArray();
        int length = 0;

        for(int i = 0; i < characters.length; ++i) {
            HashMap map = new HashMap();
            map.put(Character.valueOf(characters[i]), Integer.valueOf(i));

            for(int j = i; j < characters.length; ++j) {
                if(map.containsKey(Character.valueOf(characters[j]))) {
                    length = Math.max(length, map.size());
                    break;
                }

                map.put(Character.valueOf(characters[j]), Integer.valueOf(j));
            }
        }

        return Integer.valueOf(length);
    }
}
