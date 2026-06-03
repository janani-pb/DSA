/*
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
    int r=0;
    public void traverse(TreeNode root,int k){
        if(root==null||c>k){
            return ;
        }
        traverse(root.left,k);
        c++;
        if(c==k){
            r=root.val;
        }
        traverse(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return r;
    }
}