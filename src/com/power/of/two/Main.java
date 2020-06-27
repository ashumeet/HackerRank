package com.power.of.two;

/*
Given an integer, write a function to determine if it is a power of two.

Example 1:
Input: 1
Output: true
Explanation: 20 = 1

Example 2:
Input: 16
Output: true
Explanation: 24 = 16

Example 3:
Input: 218
Output: false
 */

public class Main {
    public static void main(String[] args){
        System.out.println(Solution.isPowerOfTwo(16));
        System.out.println(Solution.isPowerOfTwo(15));
        System.out.println(Solution.isPowerOfTwo(21));
        System.out.println(Solution.isPowerOfTwo(42));
        System.out.println(Solution.isPowerOfTwo(256));
    }
}

class Solution {
    public static boolean isPowerOfTwo(int n){
        int i = 1;
        while (i < n) {
            i *= 2;
        }
        return i == n;
    }
}