package com.plus.one;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list,
and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.plusOne(new int[] {1,2,3})));
        System.out.println(Arrays.toString(Solution.plusOne(new int[] {4,3,2,1})));
        System.out.println(Arrays.toString(Solution.plusOne(new int[] {9,9,9,9})));
    }
}

class Solution {
    public static int[] plusOne(int[] num) {
        for(int i = num.length-1; i > -1; i--) {
            if (num[i] < 9) {
                num[i]++;
                return num;
            }
            num[i] = 0;
        }
        int[] ret = new int[num.length+1];
        ret[0] = 1;
        return ret;
    }
}