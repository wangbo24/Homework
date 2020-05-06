  public String tree2str(TreeNode t) {
        // 递归终止条件
        if(t==null)
        return "";
        // 情况1
        if(t.left==null && t.right==null)
            return t.val+"";
         // 情况2
        if(t.right==null)
            return t.val+"("+tree2str(t.left)+")";
         // 情况3和4
        return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";   
    }
