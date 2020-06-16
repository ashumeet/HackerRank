package com.majority.eliment;

/*
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:
Input: [3,2,3]
Output: 3

Example 2:
Input: [2,2,1,1,1,2,2]
Output: 2
*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.majorityElement(new int[] {3,2,3}));
        System.out.println(Solution.majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
}

class Solution {
    public static int majorityElement(int [] nums) {
        if (nums.length == 1 ) {
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            if (map.containsKey(n) && map.get(n) + 1 > nums.length / 2 ) {
                return n;
            } else {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        return -1;
    }
}