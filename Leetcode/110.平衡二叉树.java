class Solution {
    public int maxDepth(TreeNode root) {
        if(root != null){ 
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
        return 0;   
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}