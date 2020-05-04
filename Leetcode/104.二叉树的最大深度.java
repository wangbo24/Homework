class Solution {
   
    public int maxDepth(TreeNode root) {
        if(root != null){ 
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
        return 0;   
    }
}