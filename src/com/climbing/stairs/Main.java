package com.climbing.stairs;

/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Intuition behind solution: We are asked, how many ways there are to reach the nth step
with the ability to climb either 1 or 2 stairs at a time. We can answer this question
by first solving smaller subproblems like how many ways are there to reach the 3rd step,
the 8th step, the nth step. By solving smaller subproblems of this large problem,
we can create a solution to the original question. We start by realizing that there
is 1 way to climb 0 steps (don't climb them). We then realize there is 1 way to
climb 1 step (we climb 1 step. We can't climb two steps because we would miss our destination step).
We can then iterate through the remaining subproblems, 2 through n and solve
the ith subproblem by realizing that the number of ways to reach the ith step is
the number of ways of reaching the i - 1 step plus the number of ways of reaching
the i - 2 step (because those are the only two stairs we could have come from because
we can only climb at most 2 steps). Once we have finished our loop,
we have solved the number of ways to reach the nth step which is stored in dp[n];
therefore, we return dp[n].
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("0: " + Solution.climbStairs(0));
        System.out.println("1: " + Solution.climbStairs(1));
        System.out.println("2: " + Solution.climbStairs(2));
        System.out.println("3: " + Solution.climbStairs(3));
        System.out.println("4: " + Solution.climbStairs(4));
        System.out.println("5: " + Solution.climbStairs(5));
        System.out.println("6: " + Solution.climbStairs(6));
        System.out.println("7: " + Solution.climbStairs(7));
        System.out.println("8: " + Solution.climbStairs(8));
        System.out.println("9: " + Solution.climbStairs(9));
        System.out.println("10: " + Solution.climbStairs(10));

        System.out.println("0: " + Solution.climbStairsRec(0));
        System.out.println("1: " + Solution.climbStairsRec(1));
        System.out.println("2: " + Solution.climbStairsRec(2));
        System.out.println("3: " + Solution.climbStairsRec(3));
        System.out.println("4: " + Solution.climbStairsRec(4));
        System.out.println("5: " + Solution.climbStairsRec(5));
        System.out.println("6: " + Solution.climbStairsRec(6));
        System.out.println("7: " + Solution.climbStairsRec(7));
        System.out.println("8: " + Solution.climbStairsRec(8));
        System.out.println("9: " + Solution.climbStairsRec(9));
        System.out.println("10: " + Solution.climbStairsRec(10));
    }
}

class Solution {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) return n;
        else return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static int climbStairsRec(int n) {
        if (n == 0 || n == 1 || n == 2) return n;
        int pos = 2;
        int last = 2;
        int secLast = 1;
        while (pos++ < n) {
            int temp = last;
            last += secLast;
            secLast = temp;
        }
        return last;
    }
}