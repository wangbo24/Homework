class Solution {
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
     
      /*  if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        } 
        return list;
    }*/
    TreeNode prev = null;
    TreeNode curNode = root;
    while(curNode != null || !stack.isEmpty()){
        while(curNode != null){
            stack.push(curNode);
            curNode = curNode.left;
        }
        curNode = stack.pop();
        
        if(curNode.right == null || curNode.right == prev){
            list.add(curNode.val);
            prev = curNode;
            curNode = null;
        }else{
            stack.add(curNode);
            curNode = curNode.right;
        }
    }
    return list;
}
}