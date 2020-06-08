package com.single.number.in.array;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.singleNumber(new int[] {1,2,3,4,5,4,3,2,1}));
    }
}

class Solution {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }
        for (int i : set) return i;
        return -1;
    }
}