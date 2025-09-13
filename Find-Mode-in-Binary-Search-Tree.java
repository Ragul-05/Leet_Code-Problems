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
    private Integer prev = null;
    private int c = 0;
    private int mC = 0;
    private List<Integer> modes;
    public int[] findMode(TreeNode root) {
       modes = new ArrayList<>();
       inorder(root);
       int[] res = new int[modes.size()];
       for(int i = 0 ; i < modes.size(); i++){
         res[i] = modes.get(i);
       }
       return res;
    }
    private void inorder(TreeNode node){
        if(node == null) return ;
        inorder(node.left);
        if(prev != null && node.val == prev){
            c++;
        }
        else{
            c = 1;
        }
        if(c > mC){
            mC = c;
            modes.clear();
            modes.add(node.val);
        }else if(c == mC){
            modes.add(node.val);
        }
        prev = node.val;
        inorder(node.right);
    }
}