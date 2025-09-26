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
    public int sumEvenGrandparent(TreeNode root) {
        return helper(root,null,null);
    }
    public int helper(TreeNode c, TreeNode p, TreeNode gp){
        if(c == null) return 0;
        int sum = 0;
        if(gp != null && gp.val % 2 == 0){
            sum += c.val;
        } 
        sum += helper(c.left,c,p);
        sum += helper(c.right,c,p);
        return sum;
    }
}