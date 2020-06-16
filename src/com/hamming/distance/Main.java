package com.hamming.distance;

/*
The Hamming distance between two integers is the number of
positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Example:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

Intuition behind solution: We need to check the binary representation of x against
the binary representation of y. We are trying to compare the ith bit of x against
the ith bit of y for every bit in their respective representations and find how many places they differ.
Because we are trying to find places where they differ,
this makes the bitwise operation XOR a great candidate for helping us create a solution.
XOR will yield a 1 when the ith bit of x and the ith bit of y differ and a 0 when they are the same.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.hammingDistance(1, 4));
        System.out.println(Solution.hammingDistance(2, 4));
        System.out.println(Solution.hammingDistance(3, 4));
        System.out.println(Solution.hammingDistance(5, 4));

    }
}

class Solution {
    public static int hammingDistance(int x, int y) {
        int result = 0;
        while (x > 0 || y > 0) {
            result += (x % 2) ^ (y % 2);
            x >>= 1;
            y >>= 1;
        }
        return result;
    }
}