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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> r = new ArrayList<>();
       order(root,r,0);
       return  r;
    }
    public void order(TreeNode root,List<Integer> r,int i){
        if(root==null){
            return;
        }
        if(r.size()==i){
            r.add(root.val);
        }
        
        order(root.right,r,i+1);
        order(root.left,r,i+1);
    }

}
