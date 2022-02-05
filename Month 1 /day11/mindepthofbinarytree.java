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
        return mins(root);
    }
    
    public int mins(TreeNode tr){
        if(tr == null) return Integer.MAX_VALUE;
        if(tr.left == null && tr.right == null) return 1; 
        return 1+Math.min(mins(tr.left) , mins(tr.right));
    }
}
