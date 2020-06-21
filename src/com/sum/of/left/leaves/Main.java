package com.sum.of.left.leaves;

/*

 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.result());
    }
}

class Solution {
    public static String result() {
        return "";
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}