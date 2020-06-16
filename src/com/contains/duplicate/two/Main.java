package com.contains.duplicate.two;

/*
Given an array of integers and an integer k, find out whether there are
two distinct indices i and j in the array such that nums[i] = nums[j] and
the absolute difference between i and j is at most k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.findDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(Solution.findDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(Solution.findDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}

class Solution {
    public static boolean findDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if (map.containsKey(current) && i - map.get(current) <= k) return true;
            else map.put(current, i);
        }
        return false;
    }
}
