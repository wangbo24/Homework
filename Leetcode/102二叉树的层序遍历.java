public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Mat = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> rowNode = new ArrayList<>();
            while(size > 0){
                TreeNode pro = queue.poll();
                rowNode.add(pro.val);
                if(pro.left != null)
                    queue.offer(pro.left);
                if(pro.right != null){
                    queue.offer(pro.right);
                }
                size--;
            }
            Mat.add(rowNode);
        }
        return Mat;
    }