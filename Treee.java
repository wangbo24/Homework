import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTree2 {
    public static int size = 0;
    public static int leafSize = 0;
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
    }

    public void preOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }else{
            System.out.println(root.val);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.println(root.val);
            inOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root);
        }
    }

    public int getSize(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getSize(root.left) + getSize(root.right) + 1;
    }


    public void getsize2(TreeNode root){
        if(root != null){
            size++;
            getsize2(root.left);
            getsize2(root.right);
        }
    }

    public int getLeafSize(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize(root.left) + getLeafSize(root.right);
    }

    public void getLeafSize2(TreeNode root){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            leafSize++;
            return ;
        }
        getLeafSize2(root.left);
        getLeafSize2(root.right);
    }

    //求第K层节点数
    public int getKSize(TreeNode root, int k){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getKSize(root.left,k-1) + getKSize(root.right, k-1);
    }
    //找值为val的结点找到返回此节点，没找到则返回null；
    public TreeNode find(TreeNode root, int val){
        if(root != null){
            if(root.val == val){
                return root;
            }
            find(root.left,val);
            find(root.right, val);
        }
        return null;
    }

    //非递归前序遍历
    public static void prOrderNoR(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;

        while (curNode != null || !st.isEmpty()) {
            //走到空时结束
            while (curNode != null) {
                //首先访问根
                System.out.print(curNode.val + " ");
                //访问根的左子树
                st.push(curNode);
                curNode = curNode.left;
            }
            curNode = st.pop();
            curNode = curNode.right;
        }
    }
    public static void inORder(TreeNode root){
        if(root != null){
            inORder(root.left);
            System.out.println(root.val);
            inORder(root.right);
        }
    }
    public static void inOrderNoR(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;
        while(!st.isEmpty() || curNode != null) {
            while (curNode != null) {
                st.push(curNode);
                curNode = curNode.left;
            }
            curNode = st.pop();
            System.out.println(curNode.val);
            curNode = curNode.right;
        }
    }

    public static void postOrder(TreeNode root) {
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+ " ");
        }
    }
    public static void postOrderNoR(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curNode = root;
        TreeNode prev = null;
        while(curNode != null || !st.isEmpty()) {
            while (curNode != null) {
                st.push(curNode);
                curNode = curNode.left;
            }
            curNode = st.pop();

            if(curNode.right == null || curNode.right == prev){
                System.out.print(curNode.val+ " ");
                prev = curNode;
                curNode = null;
            }else{
                st.push(curNode);
                curNode = curNode.right;
            }

        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;

        while(curNode != null || !stack.isEmpty()){
            while(curNode != null){
               // List<TreeNode> arr = new ArrayList(curNode.val);
                list.add(curNode.val);
                stack.push(curNode);
                curNode = curNode.left;

            }
            curNode = stack.pop();
            curNode = curNode.right;
        }
        return list;
    }


    public TreeNode buildTree(){
        TreeNode root = new TreeNode('A');
        TreeNode node1 = new TreeNode('B');
        TreeNode node2 = new TreeNode('C');
        TreeNode node3 = new TreeNode('D');
        TreeNode node4 = new TreeNode('E');
        TreeNode node5 = new TreeNode('F');
        TreeNode node6 = new TreeNode('G');
        TreeNode node7 = new TreeNode('H');
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node5.right = node6;
        node4.right = node7;
        return root;
    }

    public static void main(String[] args) {
        /*BinaryTree2 bTree = new BinaryTree2();
        TreeNode n = bTree.buildTree();
        System.out.println(bTree.getSize(n));
        bTree.getsize2(n);
        System.out.println(size);
        System.out.println(bTree.getKSize(n,3));*/
        BinaryTree2 bTree = new BinaryTree2();
        TreeNode n = bTree.buildTree();
        System.out.println("前序");
        prOrderNoR(n);
        System.out.println("houxu");
        postOrder(n);
        System.out.println("_______");
        postOrderNoR(n);

    }


}
