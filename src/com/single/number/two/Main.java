package com.single.number.two;

/*
Given a non-empty array of integers, every element appears three times except for one,
which appears exactly once. Find that single one.

Note: Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?

Example 1:
Input: [2,2,3,2]
Output: 3

Example 2:
Input: [0,1,0,1,0,1,99]
Output: 99

Intuition behind solution: Go through all the numbers placing them in a hash map
that maps from the number itself to however many times it occurs in the array.
After you have gone through all the numbers and populated the hash map,
iterate through the keys in the hash map and see if any key maps to the number one.
If it does, that key only appears once in the array so return it. Otherwise,
if we've gone through the entire hash map and never return a key,
return something that indicates we have no number in the array that appears exactly once, like -1.
*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.singleNumber(new int[] {2,2,3,2}));
        System.out.println(Solution.singleNumber(new int[] {0,1,0,1,0,1,99}));
    }
}

class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i : nums) {
            if (!set.containsKey(i)) {
                set.put(i, 2);
            } else {
                set.put(i, set.get(i) - 1);
            }
            if (set.get(i) == 0) {
                set.remove(i);
            }
        }
        for (int i : set.keySet()) return i;
        return -1;
    }
}