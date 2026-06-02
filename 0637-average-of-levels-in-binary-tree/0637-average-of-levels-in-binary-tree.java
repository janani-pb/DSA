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
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l=new ArrayList<>();
        if(root==null){
            return l ;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Double> al = new ArrayList<>();
            int s=q.size();
            double d=0;
            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();
                d+=curr.val;
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        l.add(d/s);
        }
         return l;   
    }
}