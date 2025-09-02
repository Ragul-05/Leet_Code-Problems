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
    List<String> res;
    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        if (root != null) {
            helper(root, "");
        }
        return res;
    }
    void helper(TreeNode root, String r) {
        if (root == null) return;
        r = r + root.val;
        if (root.left == null && root.right == null) {
            res.add(r);
        } else {
            r = r + "->";
            helper(root.left, r);
            helper(root.right, r);
        }
    }
}
