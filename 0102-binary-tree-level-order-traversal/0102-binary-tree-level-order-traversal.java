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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> r = new ArrayList<>();
        order(root,r,0);
        return r;
    }
    public void order(TreeNode root,List<List<Integer>> r ,int i){
        if(root==null){
            return ;
        }
        if(r.size()==i){
            r.add(new ArrayList<>());
        }
        r.get(i).add(root.val);
        order(root.left,r,i+1);
        order(root.right,r,i+1);
    }
}