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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        
        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sub = new Stack<>();
        
        path.push(root);
        sub.push(root.val);
        
        while(!path.isEmpty()){
            TreeNode temp = path.pop();
            int val = sub.pop();
            
            if(temp.left==null && temp.right==null){ if(val == sum) return true; } 
            
            if(temp.left != null){
                path.push(temp.left);
                sub.push(temp.left.val + val);
            }
            if(temp.right != null){
                path.push(temp.right);
                sub.push(temp.right.val + val);
            }
        }return false;
    }
}
