List<Integer> list = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }