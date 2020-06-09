package com.move.zeroes;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.moveZeros(new int[] {0,1,0,3,12})));
    }
}

class Solution {
    public static int[] moveZeros(int[] nums) {
        int cur = 0;
        for(int i = 0; i < nums.length; i++) if (nums[i] != 0) nums[cur++] = nums[i];
        while (cur < nums.length) nums[cur++] = 0;
        return nums;
    }
}