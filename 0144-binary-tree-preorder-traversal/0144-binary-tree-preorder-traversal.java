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
    ArrayList<Integer> arr = new ArrayList<>();
    public void Traversal(TreeNode root){
        if(root==null){
            return ;
        }
        arr.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        //ArrayList<Integer> arr = new ArrayList<>();
        Traversal(root);
        return arr;
    }
}