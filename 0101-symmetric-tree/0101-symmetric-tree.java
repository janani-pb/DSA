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
        public boolean isSymmetric(TreeNode root){
            TreeNode n = root.left;
            TreeNode m = root.right;
            return symmetric(n,m);
        }
        public boolean symmetric(TreeNode n,TreeNode m) {
            if(n==null && m==null){
                return true;
            }
            if(n!=null && m!=null&&n.val==m.val){
                return symmetric(n.left,m.right)&&symmetric(n.right,m.left);
            }
            return false;
                
}
}