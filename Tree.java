import com.sun.source.tree.Tree;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.right = null;
        n2.left = null;
        n3.left = n4;
        n3.right = n5;
        List<List<Integer>> MAt = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(n1 != null){
            queue.offer(n1);
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            while(size > 0){
                TreeNode topNode = queue.poll();
                row.add(topNode.val);
                if(topNode.left != null){
                    queue.offer(topNode.left);
                }
                if(topNode.right != null){
                    queue.offer(topNode.right);
                }
                size--;
            }
            MAt.add(row);
        }
    }
}