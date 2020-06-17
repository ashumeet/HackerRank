package com.remove.eliment;

/*
Given an array nums and a value val, remove all instances of that value in-place
and return the new length.

Do not allocate extra space for another array, you must do this by modifying
the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:
Given nums = [3,2,2,3], val = 3,
Your function should return length = 2, with the first two elements of nums being 2.
It doesn't matter what you leave beyond the returned length.

Example 2:
Given nums = [0,1,2,2,3,0,4,2], val = 2,
Your function should return length = 5, with the first five elements of nums
containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.
It doesn't matter what values are set beyond the returned length.

Intuition behind solution: Set a variable called index to zero (index will keep
track of where to place number that are not equal to val). Iterate through the
array of numbers and in each iteration check if the current number is not equal to val.
If the current number is not equal to val, place the current number in the array
at nums[index] and increment index by one. Once you have gone through all the numbers,
index will be equal to the length of the new array; therefore, we return it.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[] {3,2,2,3};
        System.out.println(Solution.removeElement(input, 3));
        System.out.println(Arrays.toString(input));
        input = new int[] {0,1,2,2,3,0,4,2};
        System.out.println(Solution.removeElement(input, 2));
        System.out.println(Arrays.toString(input));
    }
}

class Solution {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int n : nums) {
           if(n != val) {
               nums[index++] = n;
           }
        }
        return index;
    }
}