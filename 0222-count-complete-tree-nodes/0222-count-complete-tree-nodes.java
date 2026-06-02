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
    int c=0;
    public void traverse(TreeNode root){
        if(root==null){
            return ;
        }
        c++;
        traverse(root.left);
        traverse(root.right);
    }
    public int countNodes(TreeNode root) {
        traverse(root);
        return c;
    }
}