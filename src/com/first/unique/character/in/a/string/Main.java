package com.first.unique.character.in.a.string;

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.

*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.firstUniqChar("leetcode"));
        System.out.println(Solution.firstUniqChar("loveleetcode"));
    }
}

class Solution {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!map.containsKey(current)) map.put(current, i);
            else map.put(current, -1);
        }
        int index = Integer.MAX_VALUE;
        for (char c : map.keySet()) if (map.get(c) > -1 && map.get(c) < index) index = map.get(c);
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}