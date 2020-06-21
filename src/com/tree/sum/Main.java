package com.tree.sum;

/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path which sum is 22.

Intuition behind solution: Recursively ask the question, from this starting node,
does there exist a path from the current node to a leaf node such that the sum of
the node's values along the path is equal to the target sum. In each recursive call
we can subtract the current node's value from our desired sum and make a recursive
call to both the left child and the right child of the current node, passing the new target sum.
If a recursive call reaches a node in the tree that is null, we have traversed all
the way down the tree and haven't found a solution; therefore, we return false.
If the current node's value subtracted from the target sum is equal to zero and both
the left child and right child are null, we return true as we have successfully
found a root to leaf path that sums to the target sum. Otherwise, we continue
traversing the left subtree and right subtree of the current node, with our new target
sum returning true if either recursive call finds a desired path.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.hasPathSum(new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode( 7, null, null),
                                new TreeNode(2, null, null)), null),
                new TreeNode(8,
                        new TreeNode(13, null, null),
                        new TreeNode(4, null,
                                new TreeNode(1, null, null)))), 22));
    }
}

class Solution {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null && sum == 0) {
            return true;
        } else if(root == null) {
            return false;
        }
        return
                hasPathSum(root.left, sum-root.val) ||
                        hasPathSum(root.right, sum-root.val);
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