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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return symm(root.left, root.right);
    }
    public boolean symm(TreeNode left , TreeNode right){
        if(left == null && right == null) return true;

        else if(left == null || right == null) return false;

        return left.val == right.val && symm(left.left, right.right) && symm(left.right , right.left);
    }
}