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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        if(Math.abs(cal(root.left)-cal(root.right))>1) return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int cal(TreeNode boob){
        if(boob == null) return 0;
        return 1 + Math.max(cal(boob.left) , cal(boob.right));
    }
}
