public class Solution {
    private static TreeNode prev = null;
    public static void convert(TreeNode root){
        if(root == null){
            return;
        }
        convert(root.left);
        root.left = prev;
        
        if(prev != null){
            prev.right = root;
        }
        
        prev = root;
        
        convert(root.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        prev = null;
        if(pRootOfTree == null){
            return null;
        }
        convert(pRootOfTree);
        while(pRootOfTree.left != null){
            pRootOfTree = pRootOfTree.left;
        }
        return pRootOfTree;
    }
}
