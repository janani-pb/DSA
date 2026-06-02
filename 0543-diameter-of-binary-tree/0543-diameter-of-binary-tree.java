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
    int b=0;
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int max=0;
        int n=(depth(root.left));
        int a= (depth(root.right));
         b = Math.max(b,n+a);
        return 1+Math.max(n,a);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return b;
    }
}