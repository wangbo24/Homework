private int first = 0;
    public TreeNode _buildTree(int[] preorder, int[] inorder,int left,int right) {
            if(right < left){
                return null;
            }
            int val = preorder[first++];
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
            root.left =  _buildTree(preorder,inorder,left,mod - 1);
            root.right =  _buildTree(preorder,inorder,mod + 1,right);
            return root;
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return _buildTree(preorder,inorder,0,preorder.length -1);
    }