package com.sum.of.left.leaves;

/*
Find the sum of all left leaves in a given binary tree.

Example 1:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

Example 2:
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return 20.

*/

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.sumOfLeftLeaves(new TreeNode(3,
                new TreeNode( 9, null, null),
                new TreeNode(20,
                        new TreeNode(15, null, null), new TreeNode(7, null, null)))));
        System.out.println(Solution.sumOfLeftLeaves(new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode( 7, null, null),
                                new TreeNode(2, null, null)), null),
                new TreeNode(8,
                        new TreeNode(13, null, null),
                        new TreeNode(4, null,
                                new TreeNode(1, null, null))))));
    }
}

class Solution {
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
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