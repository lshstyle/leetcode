package com.example.leetcode;

import java.util.*;

public class MiddleNumber1 {

    public static void main(String[] args) {
        List<Object> a = new ArrayList<>();
        a.add(12323432432432434l);
        Set<Object> b = new HashSet<>();
        b.add(12323432432432434l);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<String, List<Integer>> charMap = new HashMap<>();
        String charStr = null;
        int maxLen = 0;
        for (int i=0; i<chars.length; i++) {
            if (charMap.containsKey(chars[i])) {
                if (charMap.get(chars[i]).size()>0) {

                }
            }
        }
        return null;
    }
}
