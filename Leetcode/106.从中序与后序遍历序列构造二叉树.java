class Solution {
    private int first = 0;
    public TreeNode buildTree(int[] postorder, int[] inorder,int left,int right) {
            if(right < left){
                return null;
            }
            int val = postorder[postorder.length - ++first];
            TreeNode root = new TreeNode(val);
            if(right == left){
                return root;
            }
            int mod = left;
            for(; mod <= right;mod++){
                if(inorder[mod] == val){
                    break;
                }
            }
            root.right =  buildTree(postorder,inorder,mod + 1,right);
            root.left =  buildTree(postorder,inorder,left,mod - 1);
            return root;
        
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(postorder,inorder,0,postorder.length -1);
    }
}