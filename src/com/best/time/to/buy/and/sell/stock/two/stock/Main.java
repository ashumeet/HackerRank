package com.best.time.to.buy.and.sell.stock.two.stock;

/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like
(i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time
(i.e., you must sell the stock before you buy again).

Example 1:
Input: [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

Example 2:
Input: [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Note that you cannot buy on day 1, buy on day 2 and sell them later,
as you are engaging multiple transactions at the same time.
You must sell before buying again.

Example 3:
Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

Intuition behind solution: Find each place where we can make a profit.
Therefore we are simply comparing the ith price with the i + 1 price at every index
and buy and selling if the ith price is less than the i + 1 price.
If this is the case, we should buy on the current day and a sell
the next day which yields a profit of prices[i + 1] - prices[i].*/

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(Solution.maxProfit(new int[] {1,2,3,4,5}));
        System.out.println(Solution.maxProfit(new int[] {7,6,4,3,1}));
    }
}

class Solution {
    public static int maxProfit(int[] price) {
        int profit = 0;
        for(int i = 0; i < price.length - 1; i++){
            if(price[i + 1] > price[i]) {
                profit += price [i + 1] - price[i];
            }
        }
        return profit;
    }
}