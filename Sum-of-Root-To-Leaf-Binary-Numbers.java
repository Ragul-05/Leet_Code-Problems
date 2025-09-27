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
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, "");
    }
    private int helper(TreeNode node, String path) {
        if (node == null) return 0;
        path += node.val;
        if (node.left == null && node.right == null) {
            return Integer.parseInt(path, 2);
        }
        return helper(node.left, path) + helper(node.right, path);
    }
}
