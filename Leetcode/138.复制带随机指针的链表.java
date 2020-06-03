/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        //建链表
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = next;
            cur = next;
        }
        //连接rondom
        cur = head;
        Node copy;
        while(cur != null){
            copy = cur.next;
            //Node next = copy.next;
            if(cur.random != null){
                copy.random = cur.random.next;
            }else{
                copy.random = null;
            }
            cur = copy.next;
        }
        //解链
        cur = head;
        Node nhead = cur.next;
        copy = cur.next;
        while(cur != null){
            Node next = copy.next;
            cur.next = next;
            if(copy.next == null){
                break;
            }
            copy.next = next.next;
            cur = next;
            copy = next.next;
        }
        return nhead;
    }
}