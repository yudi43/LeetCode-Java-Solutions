/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
*    Given a binary tree, find its minimum depth.
    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

*
* Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.
Memory Usage: 39.6 MB, less than 93.75% of Java online submissions for Minimum Depth of Binary Tree.
* * */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        if(root.left != null)
            left = minDepth(root.left) + 1;

        if(root.right != null)
            right = minDepth(root.right) + 1;

        return Math.min(left, right);
    }
}


