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
    Queue<Integer> q =new LinkedList<>();
    public void Traverse(TreeNode root){
        if(root==null){
            return;
        }
        q.add(root.val);
        Traverse(root.left);
        Traverse(root.right);
    }
    public int countNodes(TreeNode root) {
        Traverse(root);
        return q.size();
    }
}