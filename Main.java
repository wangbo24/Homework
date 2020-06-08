import java.util.*;

class Node{
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
    }
}


public class Main{

    static int i = 0;
    public static Node buildTree(String s){
        if(s.charAt(i) != '#'){
            Node root = new Node(s.charAt(i));
            ++i;
            root.left = buildTree(s);
            ++i;
            root.right = buildTree(s);
            return root;
        }
        return null;
    }

    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        //获取输入
        /*
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        */
         String line = "cf#g#ny#h#t##hpg##h#e##oebr####h##r##";
        //建树
        Node root = buildTree(line);
        //中序遍历
        inOrder(root);
        System.out.println();
    }

}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Mat = new ArrayList<>();
        Queue<TreeNode> queue  = new LinkedList<>();
        if(root != null)
            queue.offer(root);
        //层序遍历
        while(!queue.isEmpty()){
            //取出队列中的全部元素
            int size = queue.size();
            List<Integer> rowNode = new ArrayList<>();
            while(size > 0){
                TreeNode topNode = queue.poll();
                //放在同一行
                rowNode.add(topNode.val);
                if(topNode.left != null)
                    queue.offer(topNode.left);
                if(topNode.right != null)
                    queue.offer(topNode.right);
                --size;
            }
            Mat.add(rowNode);
        }
        return Mat;
    }
}
