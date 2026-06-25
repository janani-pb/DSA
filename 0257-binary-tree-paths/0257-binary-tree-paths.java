import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        
        // Base case: if it is a leaf node, add its value to the list
        if (root.left == null && root.right == null) {
            paths.add(Integer.toString(root.val));
            return paths;
        }
        
        // Recursively find paths in left subtree
        for (String path : binaryTreePaths(root.left)) {
            paths.add(root.val + "->" + path);
        }
        
        // Recursively find paths in right subtree
        for (String path : binaryTreePaths(root.right)) {
            paths.add(root.val + "->" + path);
        }
        
        return paths;
    }
}
