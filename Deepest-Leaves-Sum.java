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
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = maxHeight(root);
        return sumAtDepth(root, 1, maxDepth);
    }

    private int maxHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
    }

    private int sumAtDepth(TreeNode root, int depth, int maxDepth) {
        if (root == null) return 0;
        if (depth == maxDepth) return root.val;
        return sumAtDepth(root.left, depth + 1, maxDepth) +
               sumAtDepth(root.right, depth + 1, maxDepth);
    }
}
