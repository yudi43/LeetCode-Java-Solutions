/**
 * @author Yudhishthir Singh. Bangalore. 2020
 */

/*
* Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Note: A leaf is a node with no children.
*/

/*
*   Approach: Meke recursive calls on left and right nodes until you reach the node which is null. On each left call, increment the value of left counter and vice versa. When you reach null, return the max of right or left.
*
*   Analysis: Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
    Memory Usage: 39.4 MB, less than 92.47% of Java online submissions for Maximum Depth of Binary Tree.
*
* */

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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;

        return Math.max(left, right);
    }
}