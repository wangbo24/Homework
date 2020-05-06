import java.sql.SQLOutput;
import java.util.Scanner;

class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val = val;
    }
}
public class Main{
    static int i = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        i = 0;
        //String str = "cf#g#ny#h#t##hpg##h#e##oebr####h##r##";
        Node root = buildTree(str);
        inOrder(root);
        System.out.println();
    }
    public static Node buildTree(String s){
        if(s.charAt(i) != '#'){
            Node root  = new Node(s.charAt(i));
            i++;
            root.left = buildTree(s);
            i++;
            root.right = buildTree(s);
            return root;
        }
        return null;
    }
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
}