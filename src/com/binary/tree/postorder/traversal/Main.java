package com.binary.tree.postorder.traversal;

/*
Given a binary tree, return the postorder traversal of its nodes' values.

Example 1:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]

Example 2:

    3
   / \
  9  20
    /  \
   15   7

Output: [9,15,7,20,3]

Example 3:
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1

Output: [7,2,11,4,13,1,4,8,5]

Follow up: Recursive solution is trivial, could you do it iteratively?

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.postOrderTraversal(new TreeNode(1, null,
                new TreeNode(2,
                        new TreeNode(3, null, null), null))));

        System.out.println(Solution.postOrderTraversal(new TreeNode(3,
                new TreeNode(9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null), new TreeNode(7, null, null)))));

        System.out.println(Solution.postOrderTraversal(new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7, null, null),
                                new TreeNode(2, null, null)), null),
                new TreeNode(8,
                        new TreeNode(13, null, null),
                        new TreeNode(4, null,
                                new TreeNode(1, null, null))))));
    }
}

class Solution {
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        return result;
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