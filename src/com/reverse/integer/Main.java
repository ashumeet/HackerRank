package com.reverse.integer;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note: Assume we are dealing with an environment
which could only store integers within the 32-bit signed integer range:
[−2^31,  2^31 − 1]. For the purpose of this problem,
assume that your function returns 0 when the reversed integer overflows.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.reverseInteger(123));
        System.out.println(Solution.reverseInteger(-123));
        System.out.println(Solution.reverseInteger(120));
    }
}

class Solution {
    public static int reverseInteger(int n) {
        boolean negative = n < 0;
        n = Math.abs(n);
        long reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        return reverse > Integer.MAX_VALUE ? 0 : negative ? - (int) reverse : (int) reverse;
    }
}