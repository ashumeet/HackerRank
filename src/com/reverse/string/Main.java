package com.reverse.string;

/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.reverseString("hello"));
    }
}

class Solution {
    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i++] =  chars[j];
            chars[j--] = temp;
        }
        return new String(chars);
    }
}
