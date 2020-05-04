class Solution {
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else{
            return false;
        }
        //return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);  
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null){
            return true;
        }

        if(s != null){ 
           if(isSameTree(s,t)){
            return true;
           }
            return isSubtree(s.left,t) || isSubtree(s.right,t);  
        }
        return false;
    }
}